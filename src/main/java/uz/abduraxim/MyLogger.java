package uz.abduraxim.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  This class written by Abdurakhim Tursunboyev for training
 *  Date: 2026.27.02
 *  Personal web-site: www.abduraxim.uz
 */
public class MyLogger {

    private static final DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    private static final String RESET = "\u001B[0m";
    private static final String GREEN = "\u001B[32m";
    private static final String YELLOW = "\u001B[33m";
    private static final String RED = "\u001B[31m";
    private static final String CYAN = "\u001B[36m";

    private static String now() {
        return LocalDateTime.now().format(formatter);
    }

    public static void info(String msg) {
        System.out.println(GREEN + "[INFO]  " + now() + " - " + msg + RESET);
    }

    public static void warn(String msg) {
        System.out.println(YELLOW + "[WARN]  " + now() + " - " + msg + RESET);
    }

    public static void error(String msg) {
        System.err.println(RED + "[ERROR] " + now() + " - " + msg + RESET);
    }

    public static void debug(String msg) {
        System.out.println(CYAN + "[DEBUG] " + now() + " - " + msg + RESET);
    }

}
