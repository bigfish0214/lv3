package com.lv3.cc.thread;

import com.lv3.cc.single.LazyInnerSingleObject;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class SingletonThread implements Runnable{

    public void run() {
        System.out.println(LazyInnerSingleObject.getInstance());
    }
}
