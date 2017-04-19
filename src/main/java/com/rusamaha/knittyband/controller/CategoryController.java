package com.rusamaha.knittyband.controller;

import com.rusamaha.knittyband.model.Category;
import com.rusamaha.knittyband.services.CategoryService;
import com.rusamaha.knittyband.util.ViewUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by rusamaha on 4/9/17.
 */

@Controller
@RequestMapping("/category")
public class CategoryController {

    @Autowired
    CategoryService categoryService;

    @Autowired
    ViewUtil viewUtil;

    @RequestMapping("/getAll")
    @ResponseBody
    List<Category> getAll(){
        return categoryService.getAll();
    }

    @RequestMapping("/getAllCategory")
    ModelAndView getAllCategory(){
        ModelAndView modelAndView = new ModelAndView("categories");
        viewUtil.initView(modelAndView);
        return modelAndView;
    }
}
