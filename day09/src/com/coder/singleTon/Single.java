package com.coder.singleTon;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Single {
    private Single(){
    }
    private static Single single=new Single();
    public static Single getInstance(){
        return single;
    }

}
