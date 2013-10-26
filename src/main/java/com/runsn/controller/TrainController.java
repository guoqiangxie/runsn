package com.runsn.controller;

import com.runsn.jdbc.LabDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
        StringBuffer emailBody = new StringBuffer();
        emailBody.append("恭喜您 , 报名成功！\n");
        emailBody.append("您的课程为:");
        emailBody.append(LabDao.query(id).getName() + "\n");
        emailBody.append("您的个人信息为:");
        emailBody.append(company + " " + title + " " + address);
        Mail m = new Mail(host, username, password, mail_from, email, emailBody.toString());
        try {
            m.sendMail();
            modelAndView.setViewName("/train_4");
        } catch (Exception e) {
            modelAndView.setViewName("/train_5");
        }
        return modelAndView;
    }


    @RequestMapping("train.html")
    public ModelAndView train(ModelAndView modelAndView) {
        modelAndView.addObject("labs", LabDao.queryAll());
        modelAndView.setViewName("train");
        return modelAndView;
    }

    @RequestMapping("train_1.html")
    public String train_1() {
        return "train_1";
    }

    @RequestMapping("train_2.html")
    public String train_2() {
        return "train_2";
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
