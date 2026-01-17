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
        int inHour = sc.nextInt();
        sc.nextLine();

        System.out.println("驶入分钟");
        int inMinute = sc.nextInt();
        sc.nextLine();

        System.out.println("驶出时间");
        int outHour = sc.nextInt();
        sc.nextLine();

        System.out.println("驶出分钟");
        int outMinute = sc.nextInt();
        sc.nextLine();

        return new Car(num,type,inHour,outHour,inMinute,outMinute);
    }
}
