package com.lv3.cc.order;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class SellStock implements Order{

    private Stock abcStock;

    public SellStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
