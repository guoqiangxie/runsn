package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
