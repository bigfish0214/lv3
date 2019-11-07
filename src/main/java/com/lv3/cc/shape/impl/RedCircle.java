package com.lv3.cc.shape.impl;

import com.lv3.cc.shape.DrawAPI;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class RedCircle implements DrawAPI {
    public void drawCircle(int radius, int x, int y) {
        System.out.println(String.format("draw red circle, radius : %d, x : %d, y : %d", radius, x, y));
    }
}
