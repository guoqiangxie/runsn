package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentDetail;
import com.runsn.dto.DocumentType;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping("cases.html")
    public String cases() {
        return "admin/cases";
    }

    @RequestMapping("serviceDetail/{documentId}")
    public ModelAndView serviceDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document != null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        }
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.setViewName("admin/serviceDetail");
        return modelAndView;
    }

    @RequestMapping("solutionDetail/{documentId}")
    public ModelAndView solutionDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document != null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        }
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

    @RequestMapping("products.html")
    public ModelAndView products(ModelAndView modelAndView) {
        List<Document> documentList = DocumentDao.queryByTitle1code(3);
        List<DocumentDetail> documentDetailList = new ArrayList<DocumentDetail>();
        for (Document document : documentList) {
            DocumentDetail documentDetail = new DocumentDetail();
            documentDetail.setDocument(document);
            documentDetail.setDocumentId(document.getId());
            documentDetail.setTypeid(document.getTypeid());
            documentDetail.setDocumentType(TypeDao.query(document.getTypeid()));
            documentDetailList.add(documentDetail);
        }
        modelAndView.addObject("products", documentDetailList);
        modelAndView.setViewName("admin/products");
        return modelAndView;
    }

    @RequestMapping("productDetail/{documentId}")
    public ModelAndView productDetail(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        DocumentDetail documentDetail = new DocumentDetail();
        Document document = DocumentDao.query(documentId);
        if (document != null) {
            DocumentType documentType = TypeDao.query(document.getTypeid());
            documentDetail.setDocument(document);
            documentDetail.setDocumentType(documentType);
            documentDetail.setDocumentId(documentId);
            documentDetail.setTypeid(documentType.getId());
        }
        modelAndView.addObject("documentDetail", documentDetail);
        modelAndView.setViewName("admin/productDetail");
        return modelAndView;
    }

}
