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
}
