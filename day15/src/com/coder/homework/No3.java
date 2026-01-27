package com.coder.homework;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/26
 */
public class No3 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String str=sc.next();
        String[] strs=str.split(",");
        for (String s : strs) {
            BigDecimal bigDecimal = new BigDecimal(s);
            BigDecimal divide = bigDecimal.multiply(new BigDecimal("10")).divide(new BigDecimal("1"), 2, RoundingMode.HALF_UP);
            System.out.println(divide);
        }
    }
}
