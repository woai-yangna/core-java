package com.coder.homework;

import java.util.function.BinaryOperator;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/8
 */
public class No1 {
    public static void main(String[] args) {
        operate(10,20,(x,y)->x+y);
    }
    public static void operate(Integer x, Integer y, BinaryOperator<Integer> operate){
        Integer apply = operate.apply(x, y);
        System.out.println(apply);
    }
}
