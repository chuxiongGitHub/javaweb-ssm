package com.rainbow.service;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/27.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public interface ItemsService {
    //查询商品列表
    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
    //根据ID查询商品信息
    public ItemsCustomer findById(Integer id)throws Exception;
    //修改商品信息
    public void updateItems(Integer id,ItemsCustomer itemsCustomer)throws Exception;


}
