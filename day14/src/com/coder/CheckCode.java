package com.coder;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class CheckCode {
    public static void main(String[] args) {
        String code=getCode(4);
        System.out.println(code);
    }
    public static String getCode(int length){
        String z="abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        String code="";
        for (int i = 1; i <=length ; i++) {
            int x=(int)(Math.random()*z.length());
            code+=z.charAt(x);
        }
        return  code;
    }
}
