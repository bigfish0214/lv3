package com.lv3.cc.nullobject;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class CustomerFactory {

    private static final String[] names = {"Rob", "Joe", "Julie"};

    public static AbstractCustomer getCustomer(String name) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(name)){
                return new RealCustomer(name);
            }
        }
        return new NullCustomer();
    }

}
