package com.lv3.cc.observer;

import com.lv3.cc.image.Image;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class Subject {

    private List<Observer> observers = new ArrayList<Observer>();

    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public int getState() {
        return state;
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void notifyAllObservers(){
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
