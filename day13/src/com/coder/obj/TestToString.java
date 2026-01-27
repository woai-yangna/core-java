package com.coder.obj;

import java.util.Arrays;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/23
 */
public class TestToString {
    public static void main(String[] args) {
        Student student=new Student("李白","男",22);
        Student student1=new Student("李1","男",24);
        Student student2=new Student("李2","男",25);
        Student[] students=new Student[3];
        students[0]=student;
        students[1]=student1;
        students[2]=student2;
        System.out.println(students);
        System.out.println(Arrays.toString(students));
        /*System.out.println(student);
        System.out.println(student.toString());*/
    }
}
