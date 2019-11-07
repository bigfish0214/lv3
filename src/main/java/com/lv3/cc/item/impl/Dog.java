package com.lv3.cc.item.impl;

import com.lv3.cc.item.Animal;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class Dog extends Animal {
    public Dog() {
        name = "dog";
    }

    protected void walk() {
        System.out.println(name + " is walking");
    }
}
