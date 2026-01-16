package com.coder.staticDemo;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Person {
    static String firstName;
    String lastName;
    public void showName(){
        System.out.println(firstName+lastName);
    }
    public static void viewName(){
        Person person = new Person();
        System.out.println(firstName+person.lastName);
    }
}
