package com.lv3.cc.order;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order) {
        orderList.add(order);
    }

    public void placeOrders() {
        for(Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
