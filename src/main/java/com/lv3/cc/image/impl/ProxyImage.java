package com.lv3.cc.image.impl;

import com.lv3.cc.image.Image;

/**
 * @author lvhao
 * @date 2019-11-08
 * @description
 **/
public class ProxyImage implements Image {
    private  RealImage realImage;
    private  String fileName;

    public ProxyImage(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        if(realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
