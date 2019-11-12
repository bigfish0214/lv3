package com.lv3.cc.logger;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class ConsoleLogger extends AbstractLogger {

    public ConsoleLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
