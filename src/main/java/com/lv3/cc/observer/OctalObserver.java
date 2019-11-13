package com.lv3.cc.observer;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class OctalObserver extends Observer{

    public OctalObserver(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
    }

    protected void update() {
        System.out.println( "Octal String: "
                + Integer.toOctalString( subject.getState() ) );
    }
}
