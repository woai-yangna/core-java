package com.coder;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class CheckEmail {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        while (true){
            System.out.println("请录入eamil地址");
            String email=sc.next();
               boolean b = validateEmail(email);
            if(b){
                System.out.println("有效的eamil地址");
                break;
            }
            System.out.println("无效的eamil地址");
        }
    }
    public static boolean validateEmail(String email){
        int at=email.indexOf("@");
        int at1 = email.lastIndexOf("@");
        int dot=email.lastIndexOf(".");
        return at!=-1 && at==at1 && dot>at+1 && dot!=email.length()-1;

    }
}
