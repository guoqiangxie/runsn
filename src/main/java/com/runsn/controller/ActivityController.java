package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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
    @RequestMapping("activity.html")
    public String activity() {
        return "activity";
    }

    @RequestMapping("activity_1.html")
    public String activity_1() {
        return "activity_1";
    }

    @RequestMapping("activity_2.html")
    public String activity_2() {
        return "activity_2";
    }

    @RequestMapping("activity_3.html")
    public String activity_3() {
        return "activity_3";
    }

    @RequestMapping("activity_4.html")
    public String activity_4() {
        return "activity_4";
    }
}
