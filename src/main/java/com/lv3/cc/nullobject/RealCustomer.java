package com.lv3.cc.nullobject;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class RealCustomer extends AbstractCustomer {

    public RealCustomer(String name) {
        this.name = name;
    }

    public boolean isNil() {
        return false;
    }

    public String getName() {
        return name;
    }
}
