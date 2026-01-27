package com.coder.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class No2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("输入身份证");
        String id=sc.next();
        if(da(id)){
            String replace = replace(id);
            System.out.println("新的身份证："+replace);
            System.out.println(determineGender(id));
        }else{
            System.out.println("无效身份证");
        }
    }
    public static boolean da(String id){
        String regex="\\d{17}[\\d{1}X]";
        return id.matches(regex);
    }
    public static String replace(String id){
        StringBuffer buffer=new StringBuffer(id);
        buffer.replace(6,14,"********");
        return buffer.toString();
    }
    public static String determineGender(String id){
        char c=id.charAt(16);
        int x=Integer.parseInt(String.valueOf(c));
        return x%2==0?"女":"男";
    }
}
