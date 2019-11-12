package com.lv3.cc.order;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class BuyStock implements Order {
    /**
     * 命令接收者
     */
    private Stock abcStock;

    public BuyStock(Stock abcStock) {
        this.abcStock = abcStock;
    }

    /**
     * 调用命令接收者执行命令
     */
    public void execute() {
        abcStock.buy();
    }
}
