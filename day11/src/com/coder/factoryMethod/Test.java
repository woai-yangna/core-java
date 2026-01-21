package com.coder.factoryMethod;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {

        Factory factory=new OrangeFactory();
        Fruit fruit=factory.getFruit();
        fruit.plant();
        fruit.grow();
        fruit.harvest();
    }
}

