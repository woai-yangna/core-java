package com.coder.lambda;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/8/6
 */
public class Test {
    public static void main(String[] args) {
//        MathInterFace interFace= new MathInterFace() {
//            @Override
//            public Integer expand10(Integer i) {
//                return i*10;
//            }
//        };
        MathInterFace interFace =(i)->{return i*10;};
        System.out.println(interFace.expand10(20));
    }
}
