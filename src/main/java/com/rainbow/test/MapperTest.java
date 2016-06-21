package com.rainbow.test;

import com.rainbow.common.MybatisFactory;
import com.rainbow.entity.User;
import com.rainbow.mapper.UserMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

/**
 * Created by rainbow on 2016/6/21.
 * 每天进步一小步
 */
public class MapperTest {
    SqlSession sqlSession=null;
    //根据id查询用户
    @Test
    public void findUserById(){
        sqlSession= MybatisFactory.getSqlSession();
        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);
       try
       {
           User user=userMapper.findUserById(1);
           System.out.println(user.getUserName());
       }
       catch (Exception e){
           e.printStackTrace();
       }

    }
    /**
     * 根据用户民模糊查询用户
     */
    @Test
    public void findByName()throws Exception{
        sqlSession=MybatisFactory.getSqlSession();

        UserMapper userMapper=sqlSession.getMapper(UserMapper.class);

        List<User> userList=userMapper.findByName("%中国%");
        System.out.println(userList);
        sqlSession.close();
    }
}
