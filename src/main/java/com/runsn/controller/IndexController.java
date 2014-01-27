package com.runsn.controller;

import com.runsn.jdbc.ImagesDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Title: IndexController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(2, 11));
        modelAndView.addObject("middleImage12", ImagesDao.queryImagesByTypeAndDetailType(2, 12));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(2, 21));
        modelAndView.addObject("middleImage22", ImagesDao.queryImagesByTypeAndDetailType(2, 22));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(2, 31));
        modelAndView.addObject("middleImage32", ImagesDao.queryImagesByTypeAndDetailType(2, 32));
        modelAndView.addObject("middleImage41", ImagesDao.queryImagesByTypeAndDetailType(2, 41));
        modelAndView.addObject("middleImage42", ImagesDao.queryImagesByTypeAndDetailType(2, 42));
        modelAndView.addObject("middleImage51", ImagesDao.queryImagesByTypeAndDetailType(2, 51));
        modelAndView.addObject("middleImage52", ImagesDao.queryImagesByTypeAndDetailType(2, 52));
        modelAndView.addObject("middleImage61", ImagesDao.queryImagesByTypeAndDetailType(2, 61));
        modelAndView.addObject("middleImage62", ImagesDao.queryImagesByTypeAndDetailType(2, 62));
        modelAndView.addObject("topImages", ImagesDao.queryImagesByType(11));

        modelAndView.setViewName("index");
        return modelAndView;
    }

    @RequestMapping("index.html")
    public String indexHtml() {
        return "index";
    }
}
