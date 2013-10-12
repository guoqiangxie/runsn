package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: serviceController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class ServiceController {

    @RequestMapping("service.html")
    public String service() {
        return "service";
    }

    @RequestMapping("service_1.html")
    public String service_1() {
        return "service_1";
    }

    @RequestMapping("service_2.html")
    public String service_2() {
        return "service_2";
    }

    @RequestMapping("service_3.html")
    public String service_3() {
        return "service_3";
    }

    @RequestMapping("service_4.html")
    public String service_4() {
        return "service_4";
    }

    @RequestMapping("service_5.html")
         public String service_5() {
        return "service_5";
    }

    @RequestMapping("service_6.html")
    public String service_6() {
        return "service_6";
    }

    @RequestMapping("service_7.html")
    public String service_7() {
        return "service_7";
    }
}
