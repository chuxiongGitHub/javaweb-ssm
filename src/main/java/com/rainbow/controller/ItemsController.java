package com.rainbow.controller;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by rainbow on 2016/6/24.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Controller
public class ItemsController {
//注入service
    @Autowired
    private ItemsService itemsService;
    @RequestMapping(value = "/queryItems")
    public ModelAndView queryItems()throws Exception{
        List<ItemsCustomer> list=itemsService.findItemsList(null);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject(list);
        modelAndView.setViewName("itemList");
        return modelAndView;

    }
}
