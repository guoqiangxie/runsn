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
public class AdminController {
    @RequestMapping("admin")
    public String admin(HttpServletRequest request) {
        if (request.getSession().getAttribute("isLogin") != null) return "admin/indeximg";
        else return "login";
    }
}
