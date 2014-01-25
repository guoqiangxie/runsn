package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ProductDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
@RequestMapping(value = "search")
public class SearchController {

    @RequestMapping("")
    public ModelAndView index(@RequestParam(value = "words", required = false, defaultValue = "") String words, ModelAndView model) {
        model.addObject("searchWords", words);
        if (!"".equals(words.trim())) {
            model.addObject("searchedServices", DocumentDao.queryByTitle1codeAndWords(1, words));
            model.addObject("searchedProducts", ProductDao.queryAllByWords(words));
            model.addObject("searchedNews", DocumentDao.queryByTitle1codeAndWords(5, words));
            model.addObject("searchedSolutions", DocumentDao.queryByTitle1codeAndWords(2, words));
        }
        model.setViewName("/search");
        return model;
    }

}
