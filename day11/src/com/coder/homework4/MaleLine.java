package com.coder.homework4;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class MaleLine implements God{
    @Override
    public Person makePerson() {
        return new Male();
    }
}
