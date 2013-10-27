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
@RequestMapping(value = "solutionTemplate")
public class SolutionTemplateController {

    @RequestMapping("/{documentId}")
    public ModelAndView show(@PathVariable("documentId") int documentId, ModelAndView model) {
        Document document = DocumentDao.query(documentId);
        DocumentType documentType = TypeDao.query(document.getTypeid());
        model.addObject("document", document);
        model.addObject("documentType", documentType);
        model.setViewName("/solutionTemplate");
        return model;
    }

}
