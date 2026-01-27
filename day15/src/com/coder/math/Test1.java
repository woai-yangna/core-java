package com.coder.math;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class Test1 {
    public static void main(String[] args) {
        double count=0;
        for (int i = 1; i <=20000 ; i++) {
            double p1=Math.random();
            double p2=Math.random();
            double b1=Math.min(p1,p2);
            double b2=Math.max(p1,p2)-b1;
            double b3=1-b1-b2;
            if(b1+b2>b3 && b1+b3>b2&& b2+b3>b1){
                count++;
            }
        }
        System.out.println(count);
        System.out.println(count/20000);
        System.out.println(Math.round(count/20000*100)+"%");
    }
}
