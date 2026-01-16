package com.coder.homework;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class No1 {
    public static void main(String[] args) {
        dz4sdian dz=new dz4sdian();
        Car[] cars=dz.output();
        Taxdepartment taxdepartment=new Taxdepartment();
        taxdepartment.tax(cars);
    }
}
