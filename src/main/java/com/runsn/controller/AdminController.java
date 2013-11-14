package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentDetail;
import com.runsn.dto.DocumentType;
import com.runsn.dto.Engineer;
import com.runsn.dto.Lab;
import com.runsn.dto.Product;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.EngineerDao;
import com.runsn.jdbc.LabDao;
import com.runsn.jdbc.ProductDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: AdminController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController {
    @RequestMapping("index")
    public String admin() {
        return "redirect:services.html";
    }

    @RequestMapping("services.html")
    public ModelAndView news(ModelAndView modelAndView) {
        modelAndView.addObject("services", DocumentDao.queryByTitle1code(1));
        modelAndView.setViewName("admin/services");
        return modelAndView;
    }

    @RequestMapping("trains.html")
    public ModelAndView trains(ModelAndView modelAndView) {
        modelAndView.addObject("trains", DocumentDao.queryByTitle1code(4));
        modelAndView.setViewName("admin/trains");
        return modelAndView;
    }

    @RequestMapping("trainDetail/{documentId}")
    public ModelAndView trainDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document.getId() == 0) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        }
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.setViewName("admin/trainDetail");
        return modelAndView;
    }


    @RequestMapping("cases.html")
    public String cases() {
        return "admin/cases";
    }

    @RequestMapping("serviceDetail/{documentId}")
    public ModelAndView serviceDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document != null&&document.getCreateDate()!=null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        } else documentDetail.getDocument().setDefaultContent(1);
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.setViewName("admin/serviceDetail");
        return modelAndView;
    }

    @RequestMapping("solutionDetail/{documentId}")
    public ModelAndView solutionDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document != null&&document.getCreateDate()!=null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        } else documentDetail.getDocument().setDefaultContent(2);
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.addObject("types", TypeDao.queryByTitle1code(2));
        modelAndView.setViewName("admin/solutionDetail");
        return modelAndView;
    }

    @RequestMapping("delete/{documentId}")
    public ModelAndView delete(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        try {
            DocumentDao.delete(documentId);
            modelAndView.addObject("result", "成功啦");
            modelAndView.addObject("message", "您的信息已经删除成功");
        } catch (Exception e) {
            modelAndView.addObject("result", "失败啦");
            modelAndView.addObject("message", "您的信息删除失败");
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping("solutions.html")
    public ModelAndView solutions(ModelAndView modelAndView) {
        List<Document> documentList = DocumentDao.queryByTitle1code(2);
        List<DocumentDetail> documentDetailList = new ArrayList<DocumentDetail>();
        for (Document document : documentList) {
            DocumentDetail documentDetail = new DocumentDetail();
            documentDetail.setDocument(document);
            documentDetail.setDocumentId(document.getId());
            documentDetail.setTypeid(document.getTypeid());
            documentDetail.setDocumentType(TypeDao.query(document.getTypeid()));
            documentDetailList.add(documentDetail);
        }
        modelAndView.addObject("solutions", documentDetailList);
        modelAndView.setViewName("admin/solutions");
        return modelAndView;
    }

    @RequestMapping("labs.html")
    public ModelAndView labs(ModelAndView modelAndView) {
        modelAndView.addObject("labs", LabDao.queryAll());
        modelAndView.setViewName("admin/labs");
        return modelAndView;
    }

    @RequestMapping("labDetail/{labId}")
    public ModelAndView labDetail(@PathVariable("labId") int labId, ModelAndView modelAndView) {
        modelAndView.addObject("lab", LabDao.query(labId));
        modelAndView.setViewName("admin/labDetail");
        return modelAndView;
    }

    @RequestMapping("products.html")
    public ModelAndView products(ModelAndView modelAndView) {
        modelAndView.addObject("products", ProductDao.queryAll());
        modelAndView.setViewName("admin/products");
        return modelAndView;
    }

    @RequestMapping("productDetail/{productId}")
    public ModelAndView productDetail(@PathVariable("productId") int productId, ModelAndView modelAndView) {
        Product product = ProductDao.query(productId);
        if (product.getId() == 0) product = new Product();
        List productClasses = ProductDao.queryAllClass();
        List productBrands = ProductDao.queryAllBrand();
        List productTypes = ProductDao.queryAllType();
        modelAndView.addObject("product", product);
        modelAndView.addObject("productClasses", productClasses);
        modelAndView.addObject("productBrands", productBrands);
        modelAndView.addObject("productTypes", productTypes);
        modelAndView.setViewName("admin/productDetail");
        return modelAndView;
    }

    @RequestMapping("engineers.html")
    public ModelAndView engineers(ModelAndView modelAndView) {
        modelAndView.addObject("engineers", EngineerDao.queryAll());
        modelAndView.setViewName("admin/engineers");
        return modelAndView;
    }

    @RequestMapping("engineerDetail/{engineerId}")
    public ModelAndView engineerDetail(@PathVariable("engineerId") int engineerId, ModelAndView modelAndView) {
        modelAndView.addObject("engineer", EngineerDao.query(engineerId));
        modelAndView.setViewName("admin/engineerDetail");
        return modelAndView;
    }

    @RequestMapping("deleteEngineer/{engineerId}")
    public ModelAndView deleteEngineer(@PathVariable("engineerId") int engineerId, ModelAndView modelAndView) {
        EngineerDao.delete(engineerId);
        modelAndView.setViewName("/admin/result");
        modelAndView.addObject("result", "成功啦");
        modelAndView.addObject("message", "工程师资料删除成功");
        return modelAndView;
    }

    @RequestMapping("deleteLab/{labId}")
    public ModelAndView deleteLab(@PathVariable("labId") int labId, ModelAndView modelAndView) {
        try {
            LabDao.delete(labId);
            modelAndView.addObject("result", "成功啦");
            modelAndView.addObject("message", "您的信息已经删除成功");
        } catch (Exception e) {
            modelAndView.addObject("result", "失败啦");
            modelAndView.addObject("message", "您的信息删除失败");
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

}
