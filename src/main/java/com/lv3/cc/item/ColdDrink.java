package com.lv3.cc.item;

import com.lv3.cc.item.impl.Bottle;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public abstract class ColdDrink implements Item{
    public Packing packing() {
        return new Bottle();
    }

}
