package com.lv3.cc.main;

import com.lv3.cc.order.*;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class CommandPatternDemo {

    public static void main(String[] args) {
        Stock abcStock = new Stock();
        BuyStock buyStockOrder = new BuyStock(abcStock);
        SellStock sellStockOrder = new SellStock(abcStock);
        Broker broker = new Broker();
        broker.takeOrder(buyStockOrder);
        broker.takeOrder(sellStockOrder);
        broker.placeOrders();

    }
}
