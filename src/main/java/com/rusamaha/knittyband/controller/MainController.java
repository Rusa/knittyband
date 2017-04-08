package com.rusamaha.knittyband.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by rusamaha on 4/7/17.
 */
@Controller
public class MainController  {

    @RequestMapping("/")
    public ModelAndView adviseBeer(HttpServletRequest request, HttpServletResponse response){
        ModelAndView modelAndView = new ModelAndView("home");
        return modelAndView;
    }
}
