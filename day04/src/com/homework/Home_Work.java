package com.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class Home_Work {
    public static void main(String[] args) {
        //第一题
        /*Scanner sc =new Scanner(System.in);
        System.out.println("请输入一个数字");
        int x= sc.nextInt();
        if(x%3==0){
            if(x%5==0){
                System.out.println("乒乓");
            }else{
                System.out.println("乒");
            }
        }else if(x%5==0){
            System.out.println("乓");
        }else {
            System.out.println(x);*/

        //第二题
        /*Scanner sc =new Scanner(System.in);
        System.out.println("请输入学生分数");
        int number = sc.nextInt();
        if(number<0 || number>100){
            System.out.println("录入错误");
        }else{
        switch (number/10) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("E");
                break;
            case 6:
                System.out.println("D");
                break;
            case 7:
                System.out.println("C");
            case 8:
                System.out.println("B");
            case 9:
            case 10:
                System.out.println("A");
                break;
        }
        }*/


        //第三题
        /*Scanner sc =new Scanner(System.in);
        System.out.println("请录入第一个数");
        double x = sc.nextDouble();
        System.out.println("请录入第一个数");
        double y = sc.nextDouble();
        System.out.println("请录入操作符");
        String op = sc.next();
        double r = 0.0;
        boolean z = false;
        switch (op){
            case "+":
                r=x+y;
                break;
            case "-":
                r=x-y;
                break;
            case "*":
                r=x*y;
                break;
            case "/":
                if(y!=0)
                    r=x/y;
                else
                    z=true;
                break;
        }
        if (z){
            System.out.println("除数不能为0");
        }else {
            int m=(int)r;
            if(m==r) {
                System.out.println(x+op+y+"="+m);
            }else{
                System.out.println(x+op+y+"="+r);
            }
        }
*/


        //附加题

        Scanner sc =new Scanner(System.in);
        System.out.println("请录入年份");
        int year=sc.nextInt();
        System.out.println("请录入月份");
        int month=sc.nextInt();
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(year+"年"+month+"月:31天");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(year+"年"+month+"月:30天");
                break;
            case 2:
               boolean b= (year%4==0 && year%100!=0) || (year%400==0);
               if (b){
                   System.out.println(year+"年"+month+"月:29天");
               }else{
                   System.out.println(year+"年"+month+"月:28天");
               }
               break;
            default:
                System.out.println("月份录入错误");
        }


    }
}
