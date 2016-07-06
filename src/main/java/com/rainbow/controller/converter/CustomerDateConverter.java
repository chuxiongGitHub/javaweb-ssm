package com.rainbow.controller.converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rainbow on 2016/7/6.
 * 一事专注，便是动人；一生坚守，便是深邃！
 */
public class CustomerDateConverter implements Converter<String,Date>{

    public Date convert(String s) {
        //将日期字符串转化为日期类型
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try{
            //如果转化成功，则返回
             return simpleDateFormat.parse(s);
        }
        catch (ParseException e){
            e.printStackTrace();
        }
//如果转化失败，则返回null
        return null;
    }
}
