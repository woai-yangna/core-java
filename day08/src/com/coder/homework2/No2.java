package com.coder.homework2;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/1/16
 */
public class No2 {
    public static void main(String[] args) {
        Student student=new Student("李白",18);
        NerAdmin nerAdmin=new NerAdmin();
        nerAdmin.setName("杨娜");
        nerAdmin.check(student);
    }
}
