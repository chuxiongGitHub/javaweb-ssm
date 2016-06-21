package com.rainbow.mapper;

import com.rainbow.entity.User;

import java.util.List;

/**
 * Created by rainbow on 2016/6/21.
 * 每天进步一小步
 */
public interface UserMapper {
    //根据Id查询用户
    public User findUserById(int id) throws Exception;
    //插入用户
//    public void insertUser(User user)throws Exception;
//    //删除用户
//    public void delUser(int id)throws Exception;
//    //更新用户
//    public User updateUser(User user)throws Exception;
//    //根据用户名模糊查询用户
    public List<User> findByName(String name) throws Exception;
}
