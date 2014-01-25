package com.runsn.controller;

import com.runsn.dto.Document;
import com.runsn.dto.Images;
import com.runsn.dto.Lab;
import com.runsn.jdbc.DocumentDao;
import com.runsn.jdbc.ImagesDao;
import com.runsn.jdbc.LabDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
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
public class TrainController {

    @Value("${java.mail.host}")
    private String host;

    @Value("${java.mail.username}")
    private String username;

    @Value("${java.mail.password}")
    private String password;

    @Value("${java.mail.from}")
    private String mail_from;

    @RequestMapping("applyCourse/{labId}")
    public ModelAndView train(@PathVariable("labId") int labId, ModelAndView modelAndView) {
        modelAndView.addObject("lab", LabDao.query(labId));
        modelAndView.setViewName("/applyCourse");
        return modelAndView;
    }

    @RequestMapping(value = "/apply", method = RequestMethod.POST)
    public ModelAndView apply(@RequestParam(value = "id") int id, @RequestParam(value = "applyName") String applyName, @RequestParam(value = "phone") String phone, @RequestParam(value = "email") String email, @RequestParam(value = "company") String company, @RequestParam(value = "address") String address, @RequestParam(value = "title") String title, ModelAndView modelAndView) {
        Lab lab = LabDao.query(id);
        if (lab.getPersonNum() - lab.getAppliedPersonNum() <= 0) {
            modelAndView.addObject("lab", lab);
            modelAndView.addObject("error", "对不起，报名人数已满。");
            modelAndView.setViewName("/applyCourse");
            return modelAndView;
        }
        StringBuffer emailBody = new StringBuffer();
        emailBody.append("课程：" + lab.getName() + "\n");
        emailBody.append("姓名：" + applyName + "\n");
        emailBody.append("电话：" + phone + "\n");
        emailBody.append("邮件：" + email + "\n");
        emailBody.append("企业：" + company + "\n");
        emailBody.append("职位：" + title + "\n");
        emailBody.append("公司地址：" + address + "\n");
        email = "marketing@runsn.com";
        Mail m = new Mail(host, username, password, mail_from, email, emailBody.toString());
        try {
            m.sendMail();
            LabDao.addAppliedPersonNum(lab);
            modelAndView.setViewName("/train_4");
        } catch (Exception e) {
            modelAndView.setViewName("/train_5");
        }
        return modelAndView;
    }


    @RequestMapping("train.html")
    public ModelAndView train(ModelAndView modelAndView,
                              @RequestParam(required = false, defaultValue = "0") int linkYear,
                              @RequestParam(required = false, defaultValue = "0") int linkMonth) {
        modelAndView.addObject("labs", LabDao.queryAll());
        if (linkYear != 0 && linkMonth != 0) {
            modelAndView.addObject("linkYear", linkYear);
            modelAndView.addObject("linkMonth", linkMonth);
        }
        List<Images> imagesList = ImagesDao.queryImagesByType(4);
        modelAndView.addObject("image1", imagesList.get(0));
        modelAndView.addObject("image2", imagesList.get(1));
        modelAndView.addObject("image3", imagesList.get(2));
        modelAndView.addObject("image4", imagesList.get(3));
        modelAndView.setViewName("train");
        return modelAndView;
    }

    @RequestMapping("train_1.html")
    public String train_1() {
        return "train_1";
    }

    @RequestMapping("train_2.html")
    public String train_2() {
        List<Document> news = DocumentDao.queryByTitle1code(5);
        return "redirect:/newsTemplate/" + news.get(0).getId();
    }

    @RequestMapping("train_3.html")
    public String train_3() {
        return "train_3";
    }

    @RequestMapping("train_4.html")
    public String train_4() {
        return "train_4";
    }

    @RequestMapping("train_5.html")
    public String train_5() {
        return "train_5";
    }
}
