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
        List<Images> imagesList = ImagesDao.queryImagesByType(1);
        model.addObject("document", DocumentDao.query(documentId));
        model.addObject("documentType", TypeDao.query(DocumentDao.query(documentId).getTypeid()));
        model.addObject("rightCourse1", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        model.addObject("rightCourse2", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        model.addObject("rightCourse3", imagesList.size() > 2 ? imagesList.get(2) : new Images());
        model.setViewName("/serviceTemplate");
        return model;
    }

}
