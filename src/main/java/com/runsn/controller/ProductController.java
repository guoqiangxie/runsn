package com.runsn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created with IntelliJ IDEA.
 * Title: ProductController
 * Description:
 * User: xieguoqiang
 *
 * @version 1.0
 */
@Controller
public class ProductController {

    @RequestMapping("product.html")
    public String product() {
        return "product";
    }

    @RequestMapping("product_1.html")
    public String product_1() {
        return "product_1";
    }

    @RequestMapping("product_2.html")
    public String product_2() {
        return "product_2";
    }

    @RequestMapping("product_3.html")
    public String product_3() {
        return "product_3";
    }

    @RequestMapping("product_4.html")
    public String product_4() {
        return "product_4";
    }

    @RequestMapping("product_5.html")
    public String product_5() {
        return "product_5";
    }
}
