package com.eshare.action;

/**
 * Created by liangyh on 2016/11/19.
 * Email:10856214@163.com
 */
public class PersonAction {

    public String hello(){
        System.out.println("hello");
        boolean flag = false;
        if(flag){
            return "SUCCESS";
        }else {
            return "FAILE";
        }
    }
}
