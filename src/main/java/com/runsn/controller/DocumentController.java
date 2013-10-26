package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.Engineer;
import com.runsn.dto.Product;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.EngineerDao;
import com.runsn.jdbc.ProductDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.sql.Date;

/**
 * Created with IntelliJ IDEA.
 * Title: DocumentController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class DocumentController {

    @RequestMapping(value = "/admin/submitService", method = RequestMethod.POST)
    public ModelAndView submitService(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 1));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    private void resetDocument(String title, String keywords, String description, String content, Document document) {
        document.setTitle(title);
        document.setName(title);
        document.setKeywords(keywords);
        document.setDescription(description);
        document.setUpdateDate(new Date(new java.util.Date().getTime()));
        document.setContent(content);
    }

    @RequestMapping(value = "/admin/submitTrain", method = RequestMethod.POST)
    public ModelAndView submitTrain(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, 27));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitSolution", method = RequestMethod.POST)
    public ModelAndView submitSolution(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "title3code") int title3code, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, title3code));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetDocument(title, keywords, description, content, document);
            try {
                DocumentDao.update(document);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    @RequestMapping(value = "/admin/submitProduct", method = RequestMethod.POST)
    public ModelAndView submitProduct(@RequestParam(value = "id") int id, @RequestParam(value = "productName") String productName, @RequestParam(value = "productDesc") String productDesc, @RequestParam(value = "typeId", required = false) Integer typeId, ModelAndView modelAndView) {
        Product product = ProductDao.query(id);
        if (product.getId() == 0) {
            try {
                ProductDao.save(createProduct(productName, productDesc, typeId, product));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            resetProduct(productName, productDesc, product);
            try {
                ProductDao.update(product);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        return modelAndView;
    }

    private void resetProduct(String productName, String productDesc, Product product) {
        product.setProductName(productName);
        product.setProductDesc(productDesc);
        product.setUpdateDate(new Date(new java.util.Date().getTime()));
    }

    private Product createProduct(String productName, String productDesc, Integer typeId, Product product) {
        Product model = new Product();
       model.setTypeId(typeId);
       model.setProductName(productName);
       model.setProductDesc(productDesc);
       model.setCreateDate(new Date(new java.util.Date().getTime()));
        return model;
    }

    private static Document createDocument(String title, String content, String keywords, String description, int typeid) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setKeywords(keywords);
        document.setDescription(description);
        document.setCreateDate(new Date(new java.util.Date().getTime()));
        document.setTypeid(typeid);
        return document;
    }

    @RequestMapping("/admin/submitEngineer")
    public ModelAndView submitEngineer(ModelAndView modelAndView,
                                       @RequestParam(value = "id") Integer id,
                                       @RequestParam(value = "name") String name,
                                       @RequestParam(value = "age") int age,
                                       @RequestParam(value = "title") String title,
                                       @RequestParam(value = "experiences") String experiences,
                                       @RequestParam(value = "aptitude") String aptitude,
                                       @RequestParam(value = "image") String image) {
        Engineer engineer = EngineerDao.query(id);
        if (engineer.getId() == 0) {
            try {
                EngineerDao.save(createEngineer(name, age, title, experiences, aptitude, image));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "工程师资料提交成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息更新失败");
            }
        } else {
            try {
                resetEngineer(engineer, name, age, title, experiences, aptitude, image);
                EngineerDao.update(engineer);
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "工程师资料更新成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "工程师资料更新失败");
            }
        }
        modelAndView.setViewName("/admin/result");
        modelAndView.addObject("result", "成功啦");
        modelAndView.addObject("message", "工程师资料提交成功");
        return modelAndView;
    }

    private void resetEngineer(Engineer engineer, String name, int age, String title, String experiences, String aptitude, String image) {
        engineer.setName(name);
        engineer.setAge(age);
        engineer.setAptitude(aptitude);
        engineer.setImage(image);
        engineer.setTitle(title);
        engineer.setExperiences(experiences);
        engineer.setUpdateDate(new Date(new java.util.Date().getTime()));
    }

    private Engineer createEngineer(String name, int age, String title, String experiences, String aptitude, String image) {
        Engineer engineer = new Engineer();
        engineer.setName(name);
        engineer.setAge(age);
        engineer.setAptitude(aptitude);
        engineer.setImage(image);
        engineer.setTitle(title);
        engineer.setExperiences(experiences);
        engineer.setCreateDate(new Date(new java.util.Date().getTime()));
        engineer.setUpdateDate(new Date(new java.util.Date().getTime()));
        return engineer;
    }
}
