package com.rainbow.mapper;

import com.rainbow.entity.Items;
import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/23.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public interface ItemsMapper {
    //根据id查询信息
    public Items findItemsById(int id) throws Exception;
    //模糊查询（多条件查询）
public List<ItemsCustomer> findByName(ItemsQueryVo itemsQueryVo)throws Exception;

    public List<ItemsCustomer> findByIf(ItemsQueryVo itemsQueryVo) throws Exception;

}
