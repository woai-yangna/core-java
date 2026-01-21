package com.coder.simpleFactory;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {
        //消费
        Fruit fruit=Factory.getFruit("orange");
        if (fruit!=null) {
            fruit.plant();
            fruit.grow();
            fruit.harvest();
        }else{
            System.out.println("没有这种水果");
        }
    }
}
