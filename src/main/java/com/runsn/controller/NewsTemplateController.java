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
@RequestMapping(value = "newsTemplate")
public class NewsTemplateController {

    @RequestMapping("/{documentId}")
    public ModelAndView show(@PathVariable("documentId") int documentId, ModelAndView model) {
        Document document = DocumentDao.query(documentId);
        model.addObject("document", document);
        model.addObject("news", DocumentDao.queryByTitle1code(5));
        model.setViewName("/newsTemplate");
        return model;
    }

}
