package com.coder.util;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/31
 */
public class ShowCalendar {
    public static void main(String[] args) {
        int year=2022;
        int month=9;
        String txt=getDataTxt(year,month);
        System.out.println(txt);
    }
    public static String getDataTxt(int year,int month){
        StringBuffer buffer=new StringBuffer();
        buffer.append(year).append("年").append(month).append("月\n");
        buffer.append("日\t一\t二\t三\t四\t五\t六\n");
        Calendar c=Calendar.getInstance();
        c.set(year,month-1,1);
        int week=c.get(Calendar.DAY_OF_WEEK);
        for(int i=1;i<week;i++){
                buffer.append("\t");
        }
        for (int i = 1; i <=getMaxDays(year,month) ; i++) {
            if((i+(week-1))%7==0) {
                buffer.append(i).append("\n");
            }else {
                buffer.append(i).append("\t");
            }
        }
        return buffer.toString();
    }
    public static int getMaxDays(int year,int month){
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                GregorianCalendar calendar=new GregorianCalendar();
                boolean b = calendar.isLeapYear(year);
                return b?29:28;
            default:
                return 30;
        }
    }
}
