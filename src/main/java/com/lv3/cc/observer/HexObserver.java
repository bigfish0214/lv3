package com.lv3.cc.observer;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class HexObserver extends Observer {

    public HexObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    protected void update() {
        System.out.println( "Hex String: "
                + Integer.toHexString( subject.getState() ) );
    }
}
