package com.coder.homework.homework2.homework1;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/23
 */
public class No1  {
    public static void main(String[] args)throws CloneNotSupportedException {
        Tiger tiger=new Tiger(1.5,300);
        Tiger tiger1=(Tiger) tiger.clone();
        boolean b=tiger.equals(tiger1);
        System.out.println(b?"通过检查":"没有通过检查");
    }
}
