//package com.rainbow.test;
//
//import com.rainbow.common.MybatisFactory;
//import com.rainbow.entity.User;
//import org.apache.ibatis.session.SqlSession;
//import org.apache.ibatis.session.SqlSessionFactory;
//import org.apache.ibatis.transaction.Transaction;
//import org.junit.Test;
//
//import java.io.Console;
//import java.util.Date;
//import java.util.List;
//
///**
// * Created by rainbow on 2016/6/19.
// * 每天进步一小点
// */
//public class MybatisTest {
//    SqlSession sqlSession = null;
//
//    /**
//     * 根据用户ID来查询
//     */
//    @Test
//    public void findById() {
//        sqlSession = MybatisFactory.getSqlSession();
//
//        User user = sqlSession.selectOne("test.findById", 32);
//
//        System.out.println(user.getUserName());
//        System.out.println(user.getAddress());
//
//        sqlSession.close();
//    }
//
//    /**
//     * 根据用户名模糊查询
//     */
//    @Test
//    public void findByName() throws Exception {
//        sqlSession = MybatisFactory.getSqlSession();
//        List<User> userList = sqlSession.selectList("test.findByName", "%小明%");
//        System.out.println(userList);
//        sqlSession.close();
//    }
//
//    /**
//     * 添加用户
//     */
//    @Test
//    public void insert() throws Exception {
//        sqlSession = MybatisFactory.getSqlSession();
//
//        User user = new User();
//        user.setUserName("陈彩虹");
//        user.setBirthday(new Date());
//        user.setAddress("昆明市");
//        user.setSex("1");
//        sqlSession.insert("test.insertUser", user);
//        System.out.println(user.getId());
//        sqlSession.commit();
//
//        sqlSession.close();
//    }
//
//    /**
//     * 删除用户，根据id删除用户，需要获取id
//     */
//    @Test
//    public void delUser() throws Exception {
//        sqlSession = MybatisFactory.getSqlSession();
//
//        sqlSession.delete("test.delUser", 35);
//        sqlSession.commit();
//        System.out.println("成功删除了用户");
//        sqlSession.close();
//    }
//
//    /**
//     * 更新用户
//     */
//    @Test
//    public void update() {
//sqlSession=MybatisFactory.getSqlSession();
//        User user=new User();
//        //必须设置id
//        user.setId(1);
//        user.setUserName("中华人民共和国qwerqwer");
//        user.setAddress("中国");
//        user.setBirthday(new Date());
//sqlSession.update("test.updateUser",user);
//        sqlSession.commit();
//        sqlSession.close();
//    }
//}
