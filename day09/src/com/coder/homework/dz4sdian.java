package com.coder.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class dz4sdian {
    public Car[] output(){
        Car[] cars=new Car[3];
        cars[0]=new Car("奥迪",3.2);
        cars[1]=new Car("迈腾",2.8);
        cars[2]=new Car("宝来",1.6);
        return cars;
    }
    public Car[] output(int x){
        Car[] cars=new Car[x];
        Scanner sc =new Scanner(System.in);
        for (int i = 0; i < cars.length; i++) {
            System.out.println("请输入"+(i+1)+"车的信息");
            String brand=sc.next();
            double pailiang=sc.nextDouble();
            cars[i]=new Car(brand,pailiang);
        }
        return cars;
    }
}
