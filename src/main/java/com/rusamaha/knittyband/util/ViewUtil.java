package com.rusamaha.knittyband.util;

import com.rusamaha.knittyband.services.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by rusamaha on 4/18/17.
 */
@Component
public class ViewUtil {

    @Autowired
    CategoryService categoryService;

    public void initView(ModelAndView modelAndView){
        modelAndView.addObject("categories", categoryService.getAll());
    }
}
