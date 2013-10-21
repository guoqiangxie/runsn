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

    @RequestMapping(value = "/admin/submitService", method = RequestMethod.POST)
    public ModelAndView submitDocument(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "mainLevel", required = false) String mainLevel, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, 1, mainLevel));
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


    @RequestMapping(value = "/admin/submitSolution", method = RequestMethod.POST)
    public ModelAndView submitSolution(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "mainLevel", required = false) String mainLevel,@RequestParam(value = "mainLevelThree", required = false) String mainLevelThree, @RequestParam(value = "title2code", required = false) String title2code, @RequestParam(value = "title3code", required = false) String title3code, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            //xgqtodo 1. 如果mainLevel选中，则找到关联到一级主页  2. 如果mainLevelThree选中，则增加一条documenttype，增加一条mainLevel为3的记录
            try {
                if ("on".equals(mainLevel)) {
                    DocumentDao.save(createDocument(title, content, 23, mainLevel));
                } else if ("on".equals(mainLevelThree)) {

                }
                DocumentDao.save(createDocument(title, content, mainLevel));
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

    private static Document createDocument(String title, String content, int typeid,  String mainLevel) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setTypeid(typeid);
        document.setMainLevel("on".equals(mainLevel)?1:0);
        return document;
    }
}
