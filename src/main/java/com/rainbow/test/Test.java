package com.rainbow.test;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by rainbow on 2016/6/22.
 * 每天进步一小步
 */
public class Test {
    public static void main(String[] args) {
        int[] arr=new int[]{8,2,1,0,3};
        int[] index=new int[]{2,0,3,2,4,0,1,3,2,3,3};
        String tel="";
        for(int i:index){
            tel+=arr[i];
        }
        System.out.println("这个傻逼的电话号码是："+tel);
    }

}
