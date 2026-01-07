package com.coder.if_else_elseif;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class If_Else_Demo1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请录入你的出生月份：");
        int month = scanner.nextInt();
        if (month==12 || month==1 || month==2){
            System.out.println("冬季出生");
        } else if (month>=3 && month <=5){
            System.out.println("春季出生");
        } else if (month>=6 && month <=8) {
            System.out.println("夏季出生");

        }else if (month>=9 && month <=11) {
            System.out.println("秋季出生");
        }else {
            System.out.println("你输入错误了");
        }
    }
}
