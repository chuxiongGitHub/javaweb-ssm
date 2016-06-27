package com.rainbow.service;

import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/27.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public interface ItemsService {
    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo)throws Exception;
}
