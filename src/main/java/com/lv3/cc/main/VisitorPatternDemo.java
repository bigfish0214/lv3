package com.lv3.cc.main;

import com.lv3.cc.visit.Computer;
import com.lv3.cc.visit.ComputerPartDisplayVisitor;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class VisitorPatternDemo {

    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
