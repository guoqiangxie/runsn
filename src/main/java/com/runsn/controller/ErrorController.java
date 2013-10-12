package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: ErrorController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class ErrorController {

    @RequestMapping("error.html")
    public String error() {
        return "error";
    }
}
