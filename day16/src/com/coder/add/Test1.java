package com.coder.add;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class Test1 {
    public static void main(String[] args) {
        LocalDate date=LocalDate.now();
        System.out.println(date);
        LocalDate date1=date.withDayOfMonth(10);
        date1=date.withYear(2021).withDayOfMonth(10).withMonth(4);
        System.out.println("date1 = " + date1);
        //System.out.println("date1 = " + date1);
    }
}
