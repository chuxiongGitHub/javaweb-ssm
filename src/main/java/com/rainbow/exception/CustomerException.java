package com.rainbow.exception;

/**
 * Created by rainbow on 2016/7/11.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
/*
*系统异常处理类
 */
public class CustomerException extends Exception{
    //定义异常信息
    public String message;

    public CustomerException(String message){
        super(message);
        this.message=message;
    }
    public String getMessage(){
        return message;
    }
    public void setMessage(String message){
        this.message=message;
    }
}
