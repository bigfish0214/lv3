package com.lv3.cc.main;

import com.lv3.cc.iterator.Container;
import com.lv3.cc.iterator.Iterator;
import com.lv3.cc.iterator.NameRepository;

/**
 * @author lvhao
 * @date 2019-11-13
 * @description
 **/
public class IteratorPatternDemo {

    public static void main(String[] args) {
        Container nameRepository = new NameRepository();
        for(Iterator iterator = nameRepository.getIterator(); iterator.hasNext();){
            String name = (String)iterator.next();
            System.out.println("Name :" + name);
        }
    }

}
