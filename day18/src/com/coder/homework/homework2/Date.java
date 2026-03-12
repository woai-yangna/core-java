package com.coder.homework.homework2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class Date {
    public static LocalDate parse(String str){
        DateTimeFormatter formatter=DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.parse(str,formatter);
    }
}
