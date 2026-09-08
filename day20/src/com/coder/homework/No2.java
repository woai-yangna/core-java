package com.coder.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/8
 */
public class No2 {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->new Random().nextInt(100);
        List<Integer> list=create(supplier);

        list.forEach(System.out::println);

    }
    public static List<Integer> create(Supplier<Integer> x){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(x.get());
        }
        return list;
    }
}
