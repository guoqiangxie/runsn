package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentType;
import com.runsn.dto.Images;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ImagesDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: trainController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "serviceTemplate")
public class ServiceTemplateController {

    @RequestMapping("/{documentId}")
    public ModelAndView show(@PathVariable("documentId") int documentId, ModelAndView model) {
        Document document = DocumentDao.query(documentId);
        List<Images> imagesList = ImagesDao.queryImagesByType(1);
        DocumentType documentType = TypeDao.query(document.getTypeid());
        model.addObject("document", document);
        model.addObject("documentType", documentType);
        model.addObject("rightCourse1", imagesList.get(0));
        model.addObject("rightCourse2", imagesList.get(1));
        model.addObject("rightCourse3", imagesList.get(2));
        model.setViewName("/serviceTemplate");
        return model;
    }

}
