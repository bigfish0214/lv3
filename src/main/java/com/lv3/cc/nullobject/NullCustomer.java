package com.lv3.cc.nullobject;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class NullCustomer extends AbstractCustomer {

    public boolean isNil() {
        return true;
    }

    public String getName() {
        return "Not Available in Customer Database";
    }
}
