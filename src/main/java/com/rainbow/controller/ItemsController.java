package com.rainbow.controller;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.service.ItemsService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by rainbow on 2016/6/24.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
@Controller
//@RequestMapping(value = "/items")
public class ItemsController {
    //注入service
    @Autowired
    private ItemsService itemsService;

    @RequestMapping(value = "/queryItems" )
    public ModelAndView queryItems(HttpServletRequest request) throws Exception {
        //测试forward方法request是共享的，获取到id
        System.out.println("共享的id是："+request.getParameter("id"));


        System.out.println("调用service方法获取数据");
        List<ItemsCustomer> itemsList = itemsService.findItemsList(null);

        System.out.println("得到的数据：" + itemsList.get(1).getName());
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("itemsList", itemsList);
        modelAndView.setViewName("items/itemsList");
        return modelAndView;

    }

    //商品修改信息页面的展示
    @RequestMapping(value = "/editItems")
    public ModelAndView editItems(@RequestParam(value = "id") Integer items_id) throws Exception {
        //调用service根据id查出商品信息
        ItemsCustomer itemsCustomer = itemsService.findById(items_id);
        //返回modelAndView
        ModelAndView modelAndView = new ModelAndView();
        //将商品信息放入model
        modelAndView.addObject("itemsCustomer", itemsCustomer);
        modelAndView.setViewName("items/editItems");
        return modelAndView;
    }

    //商品信息提交
    @RequestMapping(value = "/editItemsSubmit")
    public String editItemsSubmit(HttpServletRequest request,Integer id,ItemsCustomer itemsCustomer) throws Exception {
        System.out.println("提交的id是："+request.getParameter("id"));
        System.out.println("传递进来的name："+request.getParameter("name"));
//调用service更新商品信息，页面需要将商品信息传递到此方法
itemsService.updateItems(id,itemsCustomer);
//        ModelAndView modelAndView = new ModelAndView();
////测试返回一个成功页面
//        modelAndView.setViewName("success");
//        return modelAndView;
      // return "redirect:queryItems";
        return "forward:queryItems";

    }

    public String  insertItems(HttpServletRequest request,ItemsCustomer itemsCustomer,Model model)throws Exception{
itemsService.insertItems(itemsCustomer);
        return "forward:queryItems";
    }
}
