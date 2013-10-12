package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: IndexController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class IndexController {
    @RequestMapping("")
    public String index() {
        System.out.println("hello");
        return "index";
    }
}
