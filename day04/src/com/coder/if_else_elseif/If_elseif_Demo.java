package com.coder.if_else_elseif;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/7
 */
public class If_elseif_Demo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请选择您的血型 1：A型血  2：B型血 3：O型血  4：AB型血");
        int c=scanner.nextInt();
        if (c==1){
            System.out.println("您的血型是A型血");
        }else if (c==2){
            System.out.println("您的血型是B型血");
        }else if (c==3){
            System.out.println("您的血型是O型血");
        }else if (c==4){
            System.out.println("您的血型是AB型血");
        }else {//容错
            System.out.println("选择血型错误");
        }
    }
}
