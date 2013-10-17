package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Title: AdminController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
@RequestMapping(value = "admin")
public class AdminController {
    @RequestMapping("index")
    public String admin() {
        return "admin/indeximg";
    }

    @RequestMapping("news.html")
    public String news() {
        return "admin/news";
    }

    @RequestMapping("cases.html")
    public String cases() {
        return "admin/cases";
    }

    @RequestMapping("news_page.html")
    public String newsPage() {
        return "admin/news_page";
    }
}
