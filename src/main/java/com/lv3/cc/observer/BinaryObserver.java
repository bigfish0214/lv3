package com.lv3.cc.observer;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    protected void update() {
        System.out.println( "Binary String: "
                + Integer.toBinaryString( subject.getState() ) );
    }
}
