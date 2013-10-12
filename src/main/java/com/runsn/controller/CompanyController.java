package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: CompanyController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class CompanyController {

    @RequestMapping("company.html")
    public String company() {
        return "company";
    }

    @RequestMapping("company_1.html")
    public String company_1() {
        return "company_1";
    }

    @RequestMapping("company_2.html")
    public String company_2() {
        return "company_2";
    }
    @RequestMapping("company_3.html")
    public String company_3() {
        return "company_3";
    }
    @RequestMapping("company_4.html")
    public String company_4() {
        return "company_4";
    }
    @RequestMapping("company_5.html")
    public String company_5() {
        return "company_5";
    }
    @RequestMapping("company_6.html")
    public String company_6() {
        return "company_6";
    }    @RequestMapping("company_7.html")
         public String company_7() {
        return "company_7";
    }
    @RequestMapping("company_8.html")
    public String company_8() {
        return "company_8";
    }

}
