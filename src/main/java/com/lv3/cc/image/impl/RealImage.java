package com.lv3.cc.image.impl;

import com.lv3.cc.image.Image;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }

    public void loadFromDisk(String fileName) {
        System.out.println("Loading " + fileName);
    }


    public void display() {
        System.out.println("Displaying " + fileName);
    }
}
