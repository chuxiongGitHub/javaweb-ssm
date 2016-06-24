package com.rainbow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by rainbow on 2016/6/24.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Controller
public class ItemsController {
    @RequestMapping(value = "/items")
    public String items()throws Exception{
        return "items";
    }
}
