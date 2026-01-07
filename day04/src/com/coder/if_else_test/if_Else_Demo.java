package com.coder.if_else_test;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class if_Else_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入一个整数");
        int i=scanner.nextInt();
        if(i%2==0){
            System.out.println("偶数");
        }else{
            System.out.println("奇数");
        }
    }
}
