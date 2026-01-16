package com.coder.homework3;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class No3 {
    public static void main(String[] args) {
        Monitor monitor=new Monitor();
        Car car=monitor.getcar();
        ChargeSystem system=new ChargeSystem();
        system.charge(car);
    }
}
