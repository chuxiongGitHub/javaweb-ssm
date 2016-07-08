package com.rainbow.service.impl;

import com.rainbow.entity.Items;
import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;
import com.rainbow.mapper.ItemsMapper;
import com.rainbow.mapper.ItemsMapperCustomer;
import com.rainbow.service.ItemsService;
import org.springframework.beans.BeanUtils;
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
    @Autowired
    private ItemsMapper itemsMapper;

    public List<ItemsCustomer> findItemsList(ItemsQueryVo itemsQueryVo) throws Exception {

        return itemsMapperCustomer.findItemsList(itemsQueryVo);
    }

    public void insertItems(Items items) throws Exception {
        itemsMapper.insert(items);
    }

    /**
     * 根据id查询出商品信息
     *
     * @param id
     * @return
     * @throws Exception
     */
    public ItemsCustomer findById(Integer id) throws Exception {
        Items items = itemsMapper.selectByPrimaryKey(id);

        ItemsCustomer itemsCustomer = new ItemsCustomer();
        //将items的属性值拷贝到itemsCustomer
        BeanUtils.copyProperties(items, itemsCustomer);

        return itemsCustomer;
    }

    public void updateItems(Integer id, ItemsCustomer itemsCustomer) throws Exception {
//添加业务校验
        //校验ID是否为空,如果为空则抛出异常,后面完善

        //更新商品信息,updateByPrimaryKeyWithBLOBs根据ID更新表中的所有字段，包括大字段，
        //注意：调用updateByPrimaryKeyWithBLOBs方法必须传入一个ID
        itemsCustomer.setId(id);
        itemsMapper.updateByPrimaryKeyWithBLOBs(itemsCustomer);

    }

    public void deleteById(Integer id) throws Exception {
        itemsMapper.deleteByPrimaryKey(id);
    }
}
