package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentType;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.beans.BeanUtils;
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
                DocumentDao.save(createDocument(title, content, 1, "on".equals(mainLevel) ? 1 : 0));
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
    public ModelAndView submitSolution(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "mainLevel", required = false) String mainLevel, @RequestParam(value = "mainLevelThree", required = false) String mainLevelThree, @RequestParam(value = "title2code", required = false) int title2code, @RequestParam(value = "title3code", required = false) int title3code, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                if ("on".equals(mainLevel)) {
                    DocumentDao.save(createDocument(title, content, 23, 1));
                } else if ("on".equals(mainLevelThree)) {
                    DocumentType maxType = TypeDao.queryMaxTitle3code(2, title2code);
                    DocumentType documentType = new DocumentType();
                    BeanUtils.copyProperties(maxType, documentType);
                    documentType.setId(null);
                    documentType.setTitle3(title);
                    documentType.setTitle3code(maxType.getTitle3code() + 1);
                    Integer typeid = TypeDao.save(documentType);
                    DocumentDao.save(createDocument(title, content, typeid, 3));
                } else {
                    DocumentDao.save(createDocument(title, content, title3code, null));
                }
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

    @RequestMapping(value = "/admin/submitProduct", method = RequestMethod.POST)
    public ModelAndView submitProduct(@RequestParam(value = "id") int id, @RequestParam(value = "title") String title, @RequestParam(value = "content") String content, @RequestParam(value = "title2code", required = false) Integer typeid, ModelAndView modelAndView) {
        Document document = DocumentDao.query(id);
        if (document == null) {
            try {
                DocumentDao.save(createDocument(title, content, typeid, null));
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

    private static Document createDocument(String title, String content, int typeid, Integer mainLevel) {
        Document document = new Document();
        document.setActive(1);
        document.setContent(content);
        document.setName(title);
        document.setTitle(title);
        document.setTypeid(typeid);
        document.setMainLevel(mainLevel);
        return document;
    }
}
