package com.lv3.cc.main;

import com.lv3.cc.logger.AbstractLogger;
import com.lv3.cc.logger.ConsoleLogger;
import com.lv3.cc.logger.ErrorLogger;
import com.lv3.cc.logger.FileLogger;

/**
 * @author lvhao
 * @date 2019-11-12
 * @description
 **/
public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers() {

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");

        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is a debug level information.");

        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}
