package com.lv3.cc.item.impl;

import com.lv3.cc.item.Burger;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class VegBurger extends Burger {
    public String name() {
        return "veg burger";
    }

    public float price() {
        return 10.5f;
    }
}
