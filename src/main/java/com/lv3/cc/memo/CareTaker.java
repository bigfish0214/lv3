package com.lv3.cc.memo;

import java.util.ArrayList;
import java.util.List;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
