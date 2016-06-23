package com.rainbow.test;

import com.rainbow.common.MybatisFactory;
import com.rainbow.entity.Student;
import com.rainbow.entity.StudentCustomer;
import com.rainbow.entity.StudentQueryVo;
import com.rainbow.mapper.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by rainbow on 2016/6/22.
 * 每天进步一小步
 */
public class StudentTest {
    SqlSession sqlSession = null;

    @Test
    public void findUser() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        StudentQueryVo studentQueryVo = new StudentQueryVo();
        StudentCustomer studentCustomer = new StudentCustomer();

        studentCustomer.setSex("女");
        studentCustomer.setUsername("%王%");
        studentQueryVo.setStudentCustomer(studentCustomer);

        List<StudentCustomer> list = studentMapper.findUser(studentQueryVo);
        System.out.println(list.toString());
        sqlSession.close();
    }

    /**
     * 根据id来查询用户
     */
    @Test
    public void findUserById() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();
        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        StudentCustomer studentCustomer = new StudentCustomer();
        StudentQueryVo studentQueryVo = new StudentQueryVo();
        studentCustomer.setId(1);
        studentQueryVo.setStudentCustomer(studentCustomer);

        List<StudentCustomer> list = studentMapper.findUserById(studentQueryVo);

        System.out.println(list);
    }

    /**
     * 删除用户
     */
    @Test
    public void del() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);
        StudentCustomer studentCustomer = new StudentCustomer();
        StudentQueryVo studentQueryVo = new StudentQueryVo();
        studentCustomer.setId(1);

        studentQueryVo.setStudentCustomer(studentCustomer);

        studentMapper.delUser(studentQueryVo);
        System.out.println("成功删除用户" + studentCustomer.getId());
    }

    /**
     * 新增用户
     */
    @Test
    public void addUser() throws Exception {
        sqlSession = MybatisFactory.getSqlSession();

        StudentMapper studentMapper = sqlSession.getMapper(StudentMapper.class);

        StudentCustomer studentCustomer = new StudentCustomer();
        StudentQueryVo studentQueryVo = new StudentQueryVo();

        studentCustomer.setUsername("中国");
        studentCustomer.setSex("男");
        studentCustomer.setAddress("中华人名共和国");
        studentCustomer.setDetail("天朝大国");

        studentQueryVo.setStudentCustomer(studentCustomer);

        studentMapper.insertUser(studentQueryVo);

        System.out.println("插入数据成功" + "插入的id是:" + studentCustomer.getId());
    }
}
