package com.runsn.controller;

import com.runsn.jdbc.LabDao;
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
public class TrainController {

    @RequestMapping("applyCourse/{labId}")
    public ModelAndView train(@PathVariable("labId") int labId, ModelAndView modelAndView) {
        modelAndView.addObject("lab", LabDao.query(labId));
        modelAndView.setViewName("/applyCourse");
        return modelAndView;
    }

    @RequestMapping("train.html")
    public String train() {
        return "train";
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
