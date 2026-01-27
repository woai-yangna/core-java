package com.coder.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class No4 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("录入邮箱");
        String email=sc.next();
        String[] emails=email.split(";");
        int c=0;
        int qq=0;
        for (String s : emails) {
            if(verifyEmail(s)){
                System.out.println("发送成功");
                c++;
                if(email.endsWith("@qq.com")){
                    qq++;
                }
            }else{
                System.out.println(s+"发送失败");
            }
        }
        System.out.println("一共发送了"+c+"个邮箱");
        System.out.println("一共发送了"+qq+"个qq邮箱");
    }
    public static boolean verifyEmail(String email){
        int at=email.indexOf("@");
        int at1 = email.lastIndexOf("@");
        int dot=email.lastIndexOf(".");
        return at!=-1 && at==at1 && dot>at+1 && dot!=email.length()-1;
    }
}
