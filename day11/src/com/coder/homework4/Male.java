package com.coder.homework4;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Male implements Person {
    @Override
    public void eat() {
        System.out.println("男人吃饭");
    }

    @Override
    public void speak() {
        System.out.println("男人说话");

    }

    @Override
    public void sleep() {
        System.out.println("男人睡觉");
    }
}
