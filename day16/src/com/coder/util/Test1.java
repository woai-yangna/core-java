package com.coder.util;

import java.util.GregorianCalendar;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/31
 */
public class Test1 {
    public static void main(String[] args) {
        GregorianCalendar calendar=new GregorianCalendar();
        boolean leapYear = calendar.isLeapYear(2000);
        System.out.println("leapYear"+leapYear );
    }
}
