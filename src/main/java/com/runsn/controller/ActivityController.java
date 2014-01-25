package com.runsn.controller;

import com.runsn.jdbc.ImagesDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * Title: ActivityController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class ActivityController {

    @RequestMapping("ad.html")
    public String ad() {
        return "ad";
    }

    @RequestMapping("activity.html")
    public ModelAndView activity(ModelAndView modelAndView) {
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(6, 11));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(6, 21));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(6, 31));
        modelAndView.setViewName("activity");
        return modelAndView;
    }

    @RequestMapping("activity_1.html")
    public ModelAndView activity_1(ModelAndView modelAndView) {
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(7, 11));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(7, 21));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(7, 31));
        modelAndView.setViewName("activity_1");
        return modelAndView;
    }

    @RequestMapping("activity_2.html")
    public ModelAndView activity_2(ModelAndView modelAndView) {
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(8, 11));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(8, 21));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(8, 31));
        modelAndView.setViewName("activity_2");
        return modelAndView;
    }

    @RequestMapping("activity_3.html")
    public String activity_3() {
        return "activity_3";
    }

    @RequestMapping("activity/{type}")
    public ModelAndView activityByType(@PathVariable("type") int imageType, ModelAndView modelAndView) {
        modelAndView.addObject("imageType", imageType);
        modelAndView.addObject("middleImage11", ImagesDao.queryImagesByTypeAndDetailType(imageType, 11));
        modelAndView.addObject("middleImage21", ImagesDao.queryImagesByTypeAndDetailType(imageType, 21));
        modelAndView.addObject("middleImage31", ImagesDao.queryImagesByTypeAndDetailType(imageType, 31));
        modelAndView.addObject("middleImage41", ImagesDao.queryImagesByTypeAndDetailType(imageType, 41));
        modelAndView.addObject("middleImage51", ImagesDao.queryImagesByTypeAndDetailType(imageType, 51));
        modelAndView.addObject("middleImage61", ImagesDao.queryImagesByTypeAndDetailType(imageType, 61));
        modelAndView.setViewName("activity_3");
        return modelAndView;
    }

    @RequestMapping("activityDetail/{id}")
    public ModelAndView activity_3(@PathVariable("id") int imageId, ModelAndView modelAndView) {
        modelAndView.addObject("activityDetailImage", ImagesDao.get(imageId));
        modelAndView.setViewName("activity_4");
        return modelAndView;
    }

    @RequestMapping("activity_4.html")
    public String activity_4() {
        return "activity_4";
    }
}
