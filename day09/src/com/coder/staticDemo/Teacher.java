package com.coder.staticDemo;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Teacher {
    private static int count;
    public Teacher(){
        count++;
    }
    public static void showCount(){
        System.out.println(count);
    }
}
