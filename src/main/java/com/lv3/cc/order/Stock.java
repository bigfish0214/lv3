package com.lv3.cc.order;

/**
 * @author lvhao
 * @date 2019-11-12
 * 命令接收者（实际执行命令）
 **/
public class Stock {

    private String name = "ABC";

    private int quantity = 10;

    public void buy(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] bought");
    }
    public void sell(){
        System.out.println("Stock [ Name: "+name+", Quantity: " + quantity +" ] sold");
    }

}
