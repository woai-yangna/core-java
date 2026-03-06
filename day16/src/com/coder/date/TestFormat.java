package com.coder.date;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/31
 */
public class TestFormat {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a E");
        String s=dateFormat.format(date);
        System.out.println(s);
//        System.out.println(date);
        /*DateFormat f=DateFormat.getDateInstance();
        f=DateFormat.getTimeInstance();
        f=DateFormat.getDateTimeInstance();
        String s=f.format(date);
        System.out.println(s);*/
    }
}
