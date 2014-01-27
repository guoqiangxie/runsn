package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.Images;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ImagesDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

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
    public ModelAndView ad(ModelAndView modelAndView) {
        List<Document> documents = DocumentDao.queryByTitle1code(6);
        modelAndView.addObject("leftDocument", documents.size() > 0 ? documents.get(0) : new Document());
        modelAndView.setViewName("ad");
        return modelAndView;
    }

    @RequestMapping("activity.html")
    public ModelAndView activity(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(6);
        modelAndView.addObject("middleImage11", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        modelAndView.addObject("middleImage21", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        modelAndView.addObject("middleImage31", imagesList.size() > 2 ? imagesList.get(2) : new Images());
        modelAndView.setViewName("activity");
        return modelAndView;
    }

    @RequestMapping("activity_1.html")
    public ModelAndView activity_1(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(7);
        modelAndView.addObject("middleImage11", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        modelAndView.addObject("middleImage21", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        modelAndView.addObject("middleImage31", imagesList.size() > 2 ? imagesList.get(2) : new Images());
        modelAndView.setViewName("activity_1");
        return modelAndView;
    }

    @RequestMapping("activity_2.html")
    public ModelAndView activity_2(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(8);
        modelAndView.addObject("middleImage11", imagesList.size() > 0 ? imagesList.get(0) : new Images());
        modelAndView.addObject("middleImage21", imagesList.size() > 1 ? imagesList.get(1) : new Images());
        modelAndView.addObject("middleImage31", imagesList.size() > 2 ? imagesList.get(2) : new Images());
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
        modelAndView.addObject("activityImages", ImagesDao.queryImagesByType(imageType));
        modelAndView.setViewName("activity_3");
        return modelAndView;
    }

    @RequestMapping("activityDetail/{documentId}")
    public ModelAndView activity_4(@PathVariable("documentId") int documentId, ModelAndView modelAndView) {
        modelAndView.addObject("activityDetail", DocumentDao.query(documentId));
        modelAndView.setViewName("activity_4");
        return modelAndView;
    }

    @RequestMapping("activity_4.html")
    public String activity_4() {
        return "activity_4";
    }
}
