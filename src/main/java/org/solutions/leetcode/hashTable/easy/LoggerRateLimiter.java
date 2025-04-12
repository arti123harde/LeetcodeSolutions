package org.solutions.leetcode.hashTable.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author Arti Harde
 */
public class LoggerRateLimiter {

    static Map<String, Integer> logs;

    public static void main(String[] args) {
        LoggerRateLimiter loggerRateLimiter = new LoggerRateLimiter();
        System.out.println(loggerRateLimiter.shouldPrintMessage(1, "foo"));
        System.out.println(loggerRateLimiter.shouldPrintMessage(2, "bar"));
        System.out.println(loggerRateLimiter.shouldPrintMessage(3, "foo"));
        System.out.println(loggerRateLimiter.shouldPrintMessage(8, "bar"));
        System.out.println(loggerRateLimiter.shouldPrintMessage(10, "foo"));
        System.out.println(loggerRateLimiter.shouldPrintMessage(11, "foo"));
    }

    public LoggerRateLimiter() {
        logs = new HashMap<>();
    }

    public boolean shouldPrintMessage(int timestamp, String message) {
        if(logs.containsKey(message)) {
            if(timestamp - logs.get(message) >= 10 ){
                logs.put(message, timestamp);
                return true;
            }else{
                return false;
            }
        }else{
            logs.put(message, timestamp);
            return true;
        }
    }

}
