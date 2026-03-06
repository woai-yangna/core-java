package com.coder.array;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/11
 */
public class TestMyArray {
    public static void main(String[] args) {
        MyArray array=new MyArray(4);
        array.add(123);
        array.add(456);
        array.add("sss");
        array.add(101112);
        /*System.out.println(array.size());*/
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }
        array.clear();
        System.out.println(array.size());
    }
}
