package com.lv3.cc.mediator;


import java.util.Date;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString()
                + " [" + user.getName() +"] : " + message);
    }
}
