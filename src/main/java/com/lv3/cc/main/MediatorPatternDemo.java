package com.lv3.cc.main;

import com.lv3.cc.mediator.User;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class MediatorPatternDemo {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
