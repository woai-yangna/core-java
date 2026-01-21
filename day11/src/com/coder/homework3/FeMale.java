package com.coder.homework3;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class FeMale implements Person{

    @Override
    public void eat() {
        System.out.println("女人吃饭");
    }

    @Override
    public void speak() {
        System.out.println("女人说话");

    }

    @Override
    public void sleep() {
        System.out.println("女人睡觉");
    }
}
