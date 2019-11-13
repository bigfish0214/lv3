package com.lv3.cc.main;

import com.lv3.cc.observer.BinaryObserver;
import com.lv3.cc.observer.HexObserver;
import com.lv3.cc.observer.OctalObserver;
import com.lv3.cc.observer.Subject;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class ObserverPatternDemo {

    public static void main(String[] args) {
        Subject subject = new Subject();

        new BinaryObserver(subject);
        new OctalObserver(subject);
        new HexObserver(subject);

        subject.setState(15);
        subject.setState(7);

    }
}
