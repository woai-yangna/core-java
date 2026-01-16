package com.coder.singleTon;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class SinggleTon2 {
    private SinggleTon2(){};
    private static SinggleTon2 singleton;
    public static SinggleTon2 getInstance(){
       if(singleton==null)
           singleton=new SinggleTon2();
        return singleton;
    }
}
