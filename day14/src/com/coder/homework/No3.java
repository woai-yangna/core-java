package com.coder.homework;

import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/25
 */
public class No3 {
    public static void main(String[] args) {
        String[] content={"吃饭","睡觉","上厕所"};
        Scanner sc =new Scanner(System.in);
        System.out.println("输入内容");
        String c=sc.nextLine();
        for (String s : content) {
            c=c.replace(s,turnStar(s));
        }
        System.out.println(c);
    }
    public static String turnStar(String s){
        int length=s.length();
        StringBuffer star=new StringBuffer();
        for (int i = 0; i <length ; i++) {
            star.append("*");
        }
        return star.toString();
    }
}
