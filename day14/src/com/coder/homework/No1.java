package com.coder.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class No1 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入身份证");
        String id=sc.next();

        int l=id.length();
        if(l!=18){
            System.out.println("长度错误");
        }else{
            boolean b=true;
            for (int i = 0; i <id.length()-1 ; i++) {
                char c = id.charAt(i);
                if(!Character.isDigit(c)){
                    b=false;
                    break;
                }
            }
            if(b){
                char c = id.charAt(id.length() - 1);
                if(c=='X' || Character.isDigit(c)){
                    System.out.println("有效的");
                }else{
                    System.out.println("无效的的");
                }
            }else{
                System.out.println("前17位有错误");
            }
        }


    }
}
