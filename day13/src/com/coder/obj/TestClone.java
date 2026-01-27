package com.coder.obj;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/23
 */
public class TestClone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student=new Student("李白","男",22);
        Student student1=(Student)student.clone();
        student.setName("杜甫");
        System.out.println(student);
        System.out.println(student1);

    }
}
