package com.rainbow.service.impl;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;
import com.rainbow.mapper.ItemsMapperCustomer;
import com.rainbow.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by rainbow on 2016/6/27.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class ItemsServiceImpl implements ItemsService {
    //通过注入的方式注入mapper
    @Autowired
    private ItemsMapperCustomer itemsMapperCustomer;
    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {

        return itemsMapperCustomer.findItemsList(itemsQueryVo);
    }
}
