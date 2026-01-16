package com.coder.objArray;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class Test {
    public static void main(String[] args) {
        Student student=new Student("李白","男");
        Student student1=new Student("李清照","女");
        Student[] students=new Student[2];
        students[0]=student;
        students[1]=student1;
        Teacher teacher=new Teacher();
        teacher.sign(students);
    }
}
