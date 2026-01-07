package com.coder.pested;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class If_Neste_Demo {
    public static void main(String[] args) {
        //三个数比较大小
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入三个数字比较大小");
        int x=scanner.nextInt();
        int y=scanner.nextInt();
        int z=scanner.nextInt();
        if(x>y){
            if(x>z){
                System.out.println(x+"最大");
            }else {
                System.out.println(z+"最大");
            }
        }else {
            if (y>z){
                System.out.println(y+"最大");
            }else {
                System.out.println(z+"最大");
            }
        }

    }
}
