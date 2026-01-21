package com.coder.factoryMethod;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class BananaFactory implements Factory{
    @Override
    public Fruit getFruit() {
        return new Banana();
    }
}
