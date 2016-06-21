package com.rainbow.entity;

/**
 * Created by rainbow on 2016/6/21.
 * 每天进步一小步
 */
//定义包装类型
public class UserQueryVo {
    /**
     * 包装所需要的查询条件
     */
    private UserCustomer userCustomer;

    public UserCustomer getUserCustomer() {
        return userCustomer;
    }

    public void setUserCustomer(UserCustomer userCustomer) {
        this.userCustomer = userCustomer;
    }
}
