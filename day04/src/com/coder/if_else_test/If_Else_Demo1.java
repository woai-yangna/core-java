package com.coder.if_else_test;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class If_Else_Demo1 {
    public static void main(String[] args) {
        //硬币小游戏
        double d=Math.random();//0-1之间的数
        d=d*2;//变成0-2之间的数
        int x=(int)d;//然后在转整数
        System.out.println("欢迎来到硬币小游戏：");
        System.out.println("请猜正反面 0 正面  1 反面");
        Scanner scanner = new Scanner(System.in);
        int u=scanner.nextInt();
        if(x==u){
            System.out.println("猜对了");
        }else{
            System.out.println("猜错了");
        }
    }
}
