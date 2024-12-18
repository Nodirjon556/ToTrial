package Logging;

import java.util.logging.*;

public class SimpleLogging {

    private static Logger logger = Logger.getLogger("My Logger");
    public static void main(String[] args) {
        //logger.setUseParentHandlers(false); // bu info kursatmay quyadi consolehandlerni uchirib
        Handler handler = new ConsoleHandler(); // info kursatish u-n
        SimpleFormatter simpleFormatter = new SimpleFormatter();
        handler.setFormatter(simpleFormatter);
        handler.setLevel(Level.FINE);
        logger.addHandler(handler);
        LogRecord logRecord = new LogRecord(Level.FINE,"This is a simple info log");
        logger.log(logRecord);
        //logger.log(Level.WARNING,"This is just an warning log");
    }
}
