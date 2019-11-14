package com.lv3.cc.visit;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public class ComputerPartDisplayVisitor implements ComputerPartVisitor{

    public void visit(Keyboard keyboard) {
        System.out.println("Displaying keyboard");
    }

    public void visit(Mouse mouse) {
        System.out.println("Displaying mouse");
    }

    public void visit(Monitor monitor) {
        System.out.println("Displaying monitor");
    }

    public void visit(Computer computer) {
        System.out.println("Displaying computer");
    }
}
