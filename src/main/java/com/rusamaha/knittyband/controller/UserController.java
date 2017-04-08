package com.rusamaha.knittyband.controller;

import com.rusamaha.knittyband.model.User;
import com.rusamaha.knittyband.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by rusamaha on 4/7/17.
 */

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @ResponseBody
    @RequestMapping("/getAll")
    List<User> getAll(){
        return userService.getAll();
    }

}
