package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.DocumentType;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.TypeDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Title: trainController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "template")
public class TemplateController {

    @RequestMapping("/{ducumentId}")
    public ModelAndView show(@PathVariable("ducumentId") int ducumentId, ModelAndView model) {
        Document document = DocumentDao.query(ducumentId);
        DocumentType documentType = TypeDao.query(document.getTypeid());
        model.addObject("document", document);
        model.addObject("documentType", documentType);
        model.setViewName("/template");
        return model;
    }

}
