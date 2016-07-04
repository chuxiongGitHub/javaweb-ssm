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
        System.out.println("调用service方法获取数据");
        List<ItemsCustomer> itemsList=itemsService.findItemsList(null);

        System.out.println("得到的数据："+itemsList.get(1).getName());
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("itemsList",itemsList);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;

    }
    //商品修改的controller
    public ModelAndView editItems()throws Exception{
        //返回modelAndView
        ModelAndView modelAndView=new ModelAndView();

modelAndView.setViewName("items/editItems");
        return modelAndView;
    }
}
