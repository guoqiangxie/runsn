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

    @RequestMapping("admin/deleteProduct/{id}")
    public ModelAndView deleteProduct(@PathVariable("id") int id, ModelAndView modelAndView) {
        ProductDao.delete(id);
        modelAndView.setViewName("/admin/result");
        modelAndView.addObject("result", "成功啦");
        modelAndView.addObject("message", "产品资料删除成功");
        return modelAndView;
    }

    @RequestMapping("productType/{brandId}/{typeId}")
    public ModelAndView productType(@PathVariable("brandId") int brandId, @PathVariable("typeId") int typeId, ModelAndView modelAndView) {
        List<ArrayList<Product>> productsList = groupProductForType(ProductDao.queryByBrand(brandId));
        for (ArrayList<Product> products : productsList) {
            for (Product product : products) {
                if (product.getTypeId() == typeId) {
                    modelAndView.addObject("product", product);
                    break;
                }
            }
        }
        modelAndView.addObject("productsList", productsList);
        modelAndView.setViewName("/productDetail");
        return modelAndView;
    }

    @RequestMapping("productDetail/{brandId}/{typeId}/{productId}")
    public ModelAndView productDetail(@PathVariable("brandId") int brandId, @PathVariable("typeId") int typeId, @PathVariable("productId") int productId, ModelAndView modelAndView) {
        List<ArrayList<Product>> productsList = groupProductForType(ProductDao.queryByBrand(brandId));
        modelAndView.addObject("product", ProductDao.query(productId));
        modelAndView.addObject("productsList", productsList);
        modelAndView.setViewName("/productDetail");
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

    private List groupProductForType(List<Product> products) {
        Set typeIds = new HashSet();
        for (Product product : products) {
            typeIds.add(product.getTypeId());
        }
        List result = new ArrayList();
        Iterator iterator = typeIds.iterator();
        while (iterator.hasNext()) {
            Integer typeId = (Integer) iterator.next();
            List list = new ArrayList();
            for (Product product : products) {
                if (product.getTypeId() == typeId) {
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
