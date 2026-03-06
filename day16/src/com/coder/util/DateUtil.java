package com.coder.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/31
 */
public class DateUtil {
    public static String getByPattern(String pattern){
         return new SimpleDateFormat(pattern).format(new Date());
    }
    public static String getByPattern(String pattern,Date date){
        return new SimpleDateFormat(pattern).format(date);
    }
    public static String getSystemDate(){
        /*Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        String str=dateFormat.format(date);
        return str;*/
        //return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        return getByPattern("yyyy-MM-dd");
    }
    public static String getDefaultDate(){
        //return new SimpleDateFormat("yyyy年MM月-dd日").format(new Date());
        return getByPattern("yyyy年MM月-dd日");
    }
    public static String getTime24(){
        return getByPattern("HH:mm:ss");
    }
    public static String getTime12(){
        return getByPattern("hh:mm:ss");
    }
    public static String getSystemDateTime(){
        return getByPattern("yyyy-MM-dd HH:mm:ss");
    }
    public  static String getDafaultDateTime(){
        return getByPattern("yyyy年MM月dd日 HH:mm:ss");
    }
    public  static String getDafaultDateTime(Date date){
        return getByPattern("yyyy年MM月dd日 HH:mm:ss",date);
    }
    public static String getWeekDay(){
        return getByPattern("E").replace("周","星期");
    }
    public static String getAllDateTime(){
        return getByPattern("yyyy-MM-dd HH:mm:ss:SSS ")+getWeekDay();
    }
    public static Date parse(String pattern,String dateString){
        try {
            return new SimpleDateFormat(pattern).parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args) {
        String str="2000-12-32 10:10:10";
        str="2000年12月12日 12:12:12";
        Date date=parse("yyyy年MM月dd日 HH:mm:ss",str);
        System.out.println(getDafaultDateTime(date));
    }
}
