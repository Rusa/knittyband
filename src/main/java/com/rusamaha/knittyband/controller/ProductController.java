package com.rusamaha.knittyband.controller;

import com.rusamaha.knittyband.model.Category;
import com.rusamaha.knittyband.model.Product;
import com.rusamaha.knittyband.services.ProductService;
import com.rusamaha.knittyband.util.ViewUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rusamaha on 4/7/17.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @Autowired
    ViewUtil viewUtil;

    @RequestMapping("/getAll")
    @ResponseBody
    public Iterable<Product> getAll() {
        return productService.getAll();
    }

    @RequestMapping("/getByCategory")
    @ResponseBody
    public Iterable<Product> getAll(@RequestParam Long id) {
        System.out.println(id);
        return productService.getByCategory(new Category(id));
    }

    @RequestMapping("/getProduct")
    @ResponseBody
    public ModelAndView getProduct(@RequestParam Long id) {
        ModelAndView modelAndView = new ModelAndView("product");
        modelAndView.addObject("product", productService.getProduct(id));
        viewUtil.initView(modelAndView);
        return modelAndView;
    }


//    @RequestMapping("/getByCategory")
//    ModelAndView getProductsByCategory(@RequestParam Long id) {
//        ModelAndView modelAndView = new ModelAndView("productsByCategory");
//        modelAndView.addObject("products", productService.getByCategory(new Category(id)));
//        System.out.println(id);
//        return modelAndView;
//    }
}
