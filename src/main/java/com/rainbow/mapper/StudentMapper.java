package com.rainbow.mapper;

import com.rainbow.entity.Student;
import com.rainbow.entity.StudentCustomer;
import com.rainbow.entity.StudentQueryVo;

import java.util.List;

/**
 * Created by rainbow on 2016/6/22.
 * 每天进步一小步
 */
public interface StudentMapper {
//多条件查询
    public List<StudentCustomer> findUser(StudentQueryVo studentQueryVo) throws Exception;

    //根据id来查询
    public List<StudentCustomer> findUserById(StudentQueryVo studentQueryVo) throws Exception;
    //删除一条记录
    public void delUser(StudentQueryVo studentQueryVo)throws Exception;
    //新增用户测试
    public void insertUser(StudentQueryVo studentQueryVo)throws Exception;
}
