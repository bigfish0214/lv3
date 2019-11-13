package com.lv3.cc.mediator;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sendMessage(String message) {
        ChatRoom.showMessage(this, message);
    }
}
