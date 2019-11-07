package com.lv3.cc.item.impl;

import com.lv3.cc.item.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class Meal {
    private List<Item> items = new ArrayList<Item>();

    public void add(Item item) {
        items.add(item);
    }

    public float getCost() {
        float total = 0.0f;
        for(Item item : items) {
            total += item.price();
        }
        return total;
    }

    public void showItems() {
        for(Item item : items) {
            System.out.println(item.name() + ", " + item.packing().pack() + ", " + item.price() );
        }
    }
}
