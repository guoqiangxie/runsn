package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.jdbc.DocumentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
        return "admin/indeximg";
    }

    @RequestMapping("services.html")
    public ModelAndView news(ModelAndView modelAndView) {
        modelAndView.addObject("services", DocumentDao.queryByTypeid(1));
        modelAndView.setViewName("admin/services");
        return modelAndView;
    }

    @RequestMapping("cases.html")
    public String cases() {
        return "admin/cases";
    }

    @RequestMapping("news_page/{documentId}")
    public ModelAndView newsPage(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        Document document = DocumentDao.query(documentId);
        if (document == null) document = new Document();
        modelAndView.addObject("service", document);
        modelAndView.setViewName("admin/news_page");
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
}
