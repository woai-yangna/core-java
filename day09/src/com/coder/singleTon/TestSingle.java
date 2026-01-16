package com.coder.singleTon;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class TestSingle {
    public static void main(String[] args) {
        /*Single single=Single.getInstance();
        Single single1=Single.getInstance();
        System.out.println(single==single1);*/
        SinggleTon2 single=SinggleTon2.getInstance();
        SinggleTon2 single1=SinggleTon2.getInstance();
        System.out.println(single==single1);
    }
}
