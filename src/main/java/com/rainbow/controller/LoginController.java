package com.rainbow.controller;

import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rainbow on 2016/6/20.
 * 每天进步一小步
 */
@org.springframework.stereotype.Controller
public class LoginController {
    @RequestMapping(value = "/login")
    public String login()throws Exception{
        System.out.println("用户开始登陆");
        return "/user/login";
    }
}
