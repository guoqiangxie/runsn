package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.jdbc.DocumentDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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

    @RequestMapping(value = "/admin/submitDocument", method = RequestMethod.POST)
    public ModelAndView submitDocument(@RequestParam(value = "id", required = false) int id, @RequestParam(value = "title", required = false) String title, @RequestParam(value = "content", required = false) String content, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content));
                modelAndView.addObject("result", "成功啦");
                modelAndView.addObject("message", "您的信息已经添加成功");
            } catch (Exception e) {
                modelAndView.addObject("result", "失败啦");
                modelAndView.addObject("message", "您的信息添加失败");
            }
        } else {
            document.setTitle(title);
            document.setName(title);
            document.setContent(content);
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

    private static Document createDocument(String title, String content) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setTypeid(1);
        return document;
    }
}
