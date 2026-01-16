package com.coder.homework;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Car {
    private String brand;
    private double pailiang;

    public Car() {
    }

    public Car(String brand, double pailiang) {
        this.brand = brand;
        this.pailiang = pailiang;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPailiang() {
        return pailiang;
    }

    public void setPailiang(double pailiang) {
        this.pailiang = pailiang;
    }
}
