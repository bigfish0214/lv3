package com.lv3.cc.main;

import com.lv3.cc.single.LazyInnerSingleObject;
import com.lv3.cc.single.SingleObject;
import com.lv3.cc.thread.SingletonThread;

/**
 * @author lvhao
 * @date 2019-11-07
 * @description
 **/
public class SingleMain {
    public static void main(String[] args) {
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();
        new Thread(new SingletonThread()).start();

    }
}
