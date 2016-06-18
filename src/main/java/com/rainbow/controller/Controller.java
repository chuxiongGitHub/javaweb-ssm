package com.rainbow.controller;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rainbow on 2016/6/18.
 * 每天进步一小步
 */
@org.springframework.stereotype.Controller
public class Controller {
    @RequestMapping(value = "/test")
    public String test()throws Exception{
        return "test";
    }
}
