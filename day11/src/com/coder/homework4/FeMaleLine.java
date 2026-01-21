package com.coder.homework4;

/**
 * @author teacher_shi
 * @project Core_Java
 */
public class FeMaleLine implements God{
    @Override
    public Person makePerson() {
        return new FeMale();
    }
}
