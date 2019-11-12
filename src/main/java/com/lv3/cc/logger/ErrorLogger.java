package com.lv3.cc.logger;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class ErrorLogger extends AbstractLogger {

    public ErrorLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
