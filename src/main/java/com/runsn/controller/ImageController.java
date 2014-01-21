package com.runsn.controller;

import com.runsn.dto.Images;
import com.runsn.jdbc.ImagesDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: AdminController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin/image")
public class ImageController {

    @RequestMapping("image_rightCourse.html")
    public ModelAndView engineers(ModelAndView modelAndView) {
        List<Images> imagesList = ImagesDao.queryImagesByType(1);
        modelAndView.addObject("rightCourse1", imagesList.get(0));
        modelAndView.addObject("rightCourse2", imagesList.get(1));
        modelAndView.addObject("rightCourse3", imagesList.get(2));
        modelAndView.setViewName("admin/image_rightCourse");
        return modelAndView;
    }

    @RequestMapping(value = "/submitRightCourse", method = RequestMethod.POST)
    @ResponseBody
    public String submitRightCourse(@RequestParam(value = "linkYear1") int linkYear1,
                                  @RequestParam(value = "linkMonth1") int linkMonth1,
                                  @RequestParam(value = "imageUrl1") String imageUrl1,
                                  @RequestParam(value = "linkYear2") int linkYear2,
                                  @RequestParam(value = "linkMonth2") int linkMonth2,
                                  @RequestParam(value = "imageUrl2") String imageUrl2,
                                  @RequestParam(value = "linkYear3") int linkYear3,
                                  @RequestParam(value = "linkMonth3") int linkMonth3,
                                  @RequestParam(value = "imageUrl3") String imageUrl3) {
        try {
            ImagesDao.deleteByType(1);
            ImagesDao.save(new Images(linkYear1, linkMonth1, imageUrl1));
            ImagesDao.save(new Images(linkYear2, linkMonth2, imageUrl2));
            ImagesDao.save(new Images(linkYear3, linkMonth3, imageUrl3));
            return "您的信息已经添加成功";
        } catch (Exception e) {
            e.printStackTrace();
            return "您的信息添加失败";
        }
    }
}