package com.lv3.cc.main;

import com.lv3.cc.image.Image;
import com.lv3.cc.image.impl.ProxyImage;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("text.img");
        image.display();
        System.out.println("=============");
        image.display();
    }
}
