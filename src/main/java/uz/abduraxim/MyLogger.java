package uz.abduraxim;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * MyLogger is a lightweight logging utility for Java 17+.
 * <p>
 * It provides simple static methods to log messages to the console
 * with color-coded levels and timestamps.
 * <p>
 * Logging levels supported: INFO, WARN, ERROR, DEBUG
 */
public class MyLogger {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String CYAN = "\u001B[36m";

    /**
     * Returns the current timestamp formatted as yyyy-MM-dd HH:mm:ss.
     *
     * @return formatted current timestamp
     */
    private static String now() {
        return LocalDateTime.now().format(formatter);
    }

    /**
     * Logs an informational message to the console in green.
     *
     * @param msg the message to log
     */
    public static void info(String msg) {
        System.out.println(GREEN + "[INFO]  " + now() + " - " + msg + RESET);
    }

    /**
     * Logs a warning message to the console in yellow.
     *
     * @param msg the message to log
     */
    public static void warn(String msg) {
        System.out.println(YELLOW + "[WARN]  " + now() + " - " + msg + RESET);
    }

    /**
     * Logs an error message to the console in red.
     *
     * @param msg the message to log
     */
    public static void error(String msg) {
        System.err.println(RED + "[ERROR] " + now() + " - " + msg + RESET);
    }

    /**
     * Logs a debug message to the console in cyan.
     *
     * @param msg the message to log
     */
    public static void debug(String msg) {
        System.out.println(CYAN + "[DEBUG] " + now() + " - " + msg + RESET);
    }
}