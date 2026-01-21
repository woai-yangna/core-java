package com.coder.homework4;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class Test {
    public static void main(String[] args) {
        God god=new MaleLine();
        Person person=god.makePerson();
        person.eat();
        person.sleep();
        person.speak();
    }
}
