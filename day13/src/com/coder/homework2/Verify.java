package com.coder.homework2;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/23
 */
public class Verify {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入账号");
        String name=sc.next();
        boolean b=VerifyName(name);
        if(!b){
            System.out.println("账号输入错误");
        }
        System.out.println("输入密码");
        String password=sc.next();
        boolean b1=Verifypassword(password);
        if(!b1){
            System.out.println("密码输入错误");
        }
        System.out.println("注册成功");
    }
    public static boolean VerifyName(String name){
        char[] chars=name.toCharArray();
        boolean b=true;
        for (char c : chars) {
            if(!Character.isLetter(c)){
                b=false;
                break;
            }
        }
        return b;
    }
    public static boolean Verifypassword(String password){
        char[] chars=password.toCharArray();
        boolean uppercase=false;
        boolean lowercase=false;
        boolean digit=false;
        for (char c : chars) {
            if(Character.isDigit(c)){
                digit=true;
            }else if(Character.isUpperCase(c)){
                uppercase=true;
            }else if(Character.isLowerCase(c)){
                lowercase=true;
            }
        }
        return uppercase&&lowercase&&digit;
    }
}
