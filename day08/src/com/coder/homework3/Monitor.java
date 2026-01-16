package com.coder.homework3;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Monitor {
    public Car getcar(){
        Scanner sc =new Scanner(System.in);
        System.out.println("请扫描车牌号码");
        String num=sc.next();
        System.out.println("车辆类型");
        String type=sc.next();
        System.out.println("驶入时间");
        int inHour=sc.nextInt();
        int inMinute= sc.nextInt();
        System.out.println("驶出时间");
        int outHour=sc.nextInt();
        int outMinute= sc.nextInt();
        return new Car(num,type,inHour,inMinute,outHour,outMinute);
    }
}
