package com.lv3.cc.visit;

/**
 * @author lvhao
 * @date 2019-11-14
 * @description
 **/
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
