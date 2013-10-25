package com.runsn.controller;

import com.runsn.dto.Product;
import com.runsn.jdbc.ProductDao;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

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

    @RequestMapping("productClass/{classId}")
    public ModelAndView productClass(@PathVariable("classId") int classId, ModelAndView modelAndView) {
        modelAndView.addObject("typesList", groupProducts(ProductDao.queryTypeByClass(classId)));
        modelAndView.setViewName("/productClassTemplate");
        return modelAndView;
    }

    private List groupProducts(List<Product> products) {
        Set brandIds = new HashSet();
        for (Product product : products) {
            brandIds.add(product.getBrandId());
        }
        List result = new ArrayList();
        Iterator iterator = brandIds.iterator();
        while (iterator.hasNext()) {
            Integer brandId = (Integer) iterator.next();
            List list = new ArrayList();
            for (Product product : products) {
                if (product.getBrandId() == brandId) {
                    list.add(product);
                }
            }
            result.add(list);
        }
        return result;
    }

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
