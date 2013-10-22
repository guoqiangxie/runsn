package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.jdbc.DocumentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

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
        document.setUpdateDate(new Date());
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
    public ModelAndView submitProduct(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "keywords", required = false) String keywords, @RequestParam(value = "description", required = false) String description, @RequestParam(value = "content") String content, @RequestParam(value = "title2code", required = false) Integer typeid, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, keywords, description, typeid));
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

    private static Document createDocument(String title, String content, String keywords, String description, int typeid) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setKeywords(keywords);
        document.setDescription(description);
        document.setCreateDate(new Date());
        document.setTypeid(typeid);
        return document;
    }
}
