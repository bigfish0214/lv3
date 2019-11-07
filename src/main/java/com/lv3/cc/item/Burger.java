package com.lv3.cc.item;

import com.lv3.cc.item.impl.Wrapper;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public abstract class Burger implements Item{

    public Packing packing() {
        return new Wrapper();
    }

}
