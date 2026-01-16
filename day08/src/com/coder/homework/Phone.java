package com.coder.homework;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Phone {
    private String color;
    private String brand;
    private String factory;
    private int weight;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    public void call(){
        System.out.println("正在使用"+color+factory+brand+"重量为:"+weight+"的手机打电话...");
    }
    public void sendmessage(){
        System.out.println("正在使用"+color+factory+brand+"重量为:"+weight+"的手机打电话...");
    }
}
