package com.coder.newMethod;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public interface Inter1 {
    void eat();

    default void sleep() {
        test();
        System.out.println("在床上睡觉");
    }
    default void sleep1() {
        test();
        System.out.println("在床上睡觉");
    }
    static void showName(){
        //test();
        System.out.println("我的名字是中国人");
    }
    private void test(){
        System.out.println("这是一段有用的代码");
        System.out.println("这是一段有用的代码");
        System.out.println("这是一段有用的代码");
    }

}

class Person1 implements Inter1 {

    @Override
    public void eat() {
        System.out.println("吃米饭");
    }
    public void sleep(){
        System.out.println("在地上睡觉");
    }

}

class Person2 implements Inter1 {

    @Override
    public void eat() {
        System.out.println("吃面条");
    }

}
