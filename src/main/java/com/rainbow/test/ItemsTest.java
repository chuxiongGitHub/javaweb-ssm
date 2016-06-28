package com.rainbow.test;

import com.rainbow.common.MybatisFactory;
import com.rainbow.entity.Items;
import com.rainbow.entity.ItemsCustomer;
import com.rainbow.entity.ItemsQueryVo;
import com.rainbow.mapper.ItemsMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by rainbow on 2016/6/23.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */

public class ItemsTest {
    SqlSession sqlSession = null;

    @Test
    public void findById() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        ItemsMapper itemsMapper = sqlSession.getMapper(ItemsMapper.class);


        Items items = itemsMapper.findItemsById(1);
        System.out.println(items.getName() + items.getDetail());
        sqlSession.close();
    }

    //多条件查询
    @Test
    public void findByName() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        ItemsMapper itemsMapper = sqlSession.getMapper(ItemsMapper.class);

        ItemsCustomer itemsCustomer = new ItemsCustomer();
        ItemsQueryVo itemsQueryVo = new ItemsQueryVo();

        itemsCustomer.setPrice(200f);
        itemsCustomer.setDetail("%质量%");
        itemsQueryVo.setItemsCustomer(itemsCustomer);

        List<ItemsCustomer> list = itemsMapper.findByName(itemsQueryVo);
        System.out.println(list.get(0).getDetail());
        sqlSession.close();
    }

    /**
     * 动态SQL测试
     */
    @Test
    public void findTest() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        ItemsMapper itemsMapper = sqlSession.getMapper(ItemsMapper.class);

        ItemsCustomer itemsCustomer = new ItemsCustomer();
        ItemsQueryVo itemsQueryVo = new ItemsQueryVo();
        itemsCustomer.setPrice(200f);
        itemsCustomer.setDetail("质量");
        itemsQueryVo.setItemsCustomer(itemsCustomer);

        List<ItemsCustomer> list = itemsMapper.findByIf(itemsQueryVo);
        System.out.println(list.get(1).getDetail());
        sqlSession.close();
    }
}
