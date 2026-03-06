package com.coder.homework;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class No1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.of(2003,2,16);
        LocalDate date1=LocalDate.now();
        long between = ChronoUnit.DAYS.between(date, date1);
        System.out.println("between = " + between);
    }
}
