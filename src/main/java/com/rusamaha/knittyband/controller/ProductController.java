package com.rusamaha.knittyband.controller;

import com.rusamaha.knittyband.model.Category;
import com.rusamaha.knittyband.model.Product;
import com.rusamaha.knittyband.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by rusamaha on 4/7/17.
 */
@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("/getAll")
    @ResponseBody
    public Iterable<Product> getAll(){
        return productService.getAll();
    }

    @RequestMapping("/getByCategory")
    @ResponseBody
    public Iterable<Product> getAll(@RequestParam Long id){
        System.out.println(id);
        return productService.getByCategory(new Category(id));
    }
}
