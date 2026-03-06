package com.coder.util;

import java.util.Calendar;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/31
 */
public class Test {
    public static void main(String[] args) {
        Calendar calendar=Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH)+1;
        System.out.println(month);
        int date=calendar.get(Calendar.DATE);
        System.out.println(date);
    }
}
