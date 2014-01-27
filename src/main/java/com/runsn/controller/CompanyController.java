package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.Images;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ImagesDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Title: CompanyController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class CompanyController {

    @RequestMapping("company.html")
    public ModelAndView company(ModelAndView modelAndView) {
        List<Images> leftImagesList = ImagesDao.queryImagesByType(9);
        Images leftImage = leftImagesList.size() > 0 ? leftImagesList.get(0) : new Images();
        List<Images> rightImagesList = ImagesDao.queryImagesByType(10);
        Images rightImage = rightImagesList.size() > 0 ? rightImagesList.get(0) : new Images();
        modelAndView.addObject("leftImage", leftImage);
        modelAndView.addObject("rightImage", rightImage);
        modelAndView.setViewName("company");
        return modelAndView;
    }

    @RequestMapping("company_1.html")
    public String company_1() {
        return "company_1";
    }

    @RequestMapping("company_2.html")
    public String company_2() {
        return "company_2";
    }
    @RequestMapping("company_3.html")
    public String company_3() {
        return "company_3";
    }
    @RequestMapping("company_4.html")
    public String company_4() {
        return "company_4";
    }
    @RequestMapping("company_5.html")
    public ModelAndView company_5(ModelAndView modelAndView) {
        List<Document> documents = DocumentDao.queryByTitle1code(7);
        modelAndView.addObject("rightDocument", documents.size() > 0 ? documents.get(0) : new Document());
        modelAndView.setViewName("company_5");
        return modelAndView;
    }
    @RequestMapping("company_6.html")
    public String company_6() {
        return "company_6";
    }    @RequestMapping("company_7.html")
         public String company_7() {
        return "company_7";
    }
    @RequestMapping("company_8.html")
    public String company_8() {
        return "company_8";
    }

}
