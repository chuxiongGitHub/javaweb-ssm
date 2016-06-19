package com.rainbow.controller;


import com.rainbow.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by rainbow on 2016/6/18.
 * 每天进步一小步
 */
@Controller
public class UserController {
    @RequestMapping(value = "/user")
    public ModelAndView modelAndView()throws Exception{

        List<User> userList=new ArrayList<User>();

        User user=new User();
        user.setUserName("昆明");

        userList.add(user);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(userList);
        modelAndView.setViewName("userList");

        return modelAndView;
    }
}
