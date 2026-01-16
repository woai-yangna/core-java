package com.coder.staticDemo;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class TestPerson {
    public static void main(String[] args) {
        Person.firstName="张";
        Person p1=new Person();
        p1.lastName="三";
        p1.showName();

        Person p2=new Person();
        p2.lastName="四";
        p2.showName();
    }
}
