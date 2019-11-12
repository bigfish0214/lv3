package com.lv3.cc.logger;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class FileLogger extends AbstractLogger {

    public FileLogger(int level) {
        this.level = level;
    }

    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
