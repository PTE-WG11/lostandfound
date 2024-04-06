package com.example.lostandfound.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {

    /**
     * 获取当前日期时间并转换为默认格式（"yyyy-MM-dd HH:mm:ss"）的字符串
     *
     * @return 当前日期时间的字符串表示，使用默认格式
     */
    public static String getCurrentDateTimeAsString() {
        return getCurrentDateTimeAsString("yyyy-MM-dd HH:mm:ss");
    }

    /**
     * 获取当前日期时间并转换为指定格式的字符串
     *
     * @param pattern 日期时间格式，例如："yyyy-MM-dd HH:mm:ss"
     * @return 当前日期时间的字符串表示
     */
    public static String getCurrentDateTimeAsString(String pattern) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return now.format(formatter);
    }

/*    // 主方法，用于测试工具类
    public static void main(String[] args) {
        // 使用默认格式
        String currentDateTimeDefault = getCurrentDateTimeAsString();
        System.out.println("当前日期时间（默认格式）：" + currentDateTimeDefault);

        // 使用自定义格式
        String currentDateTimeCustom = getCurrentDateTimeAsString("yyyy/MM/dd EEE HH:mm:ss");
        System.out.println("当前日期时间（自定义格式）：" + currentDateTimeCustom);
    }*/
}