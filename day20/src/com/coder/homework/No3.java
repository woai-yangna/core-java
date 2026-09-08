package com.coder.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/8
 */
public class No3 {
    public static void main(String[] args) {
        Supplier<Integer> supplier=()->new Random().nextInt(100);
        List<Integer> list=create(supplier);
        Predicate<Integer> predicate=(x)->x%2==0;
        List<Integer> newList=filter(list,predicate);
        newList.forEach(System.out::println);
    }
    public static List<Integer> create(Supplier<Integer> x){
        List<Integer> list=new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(x.get());
        }
        return list;
    }
    public static List<Integer> filter(List<Integer> list, Predicate<Integer> predicate) {
        List<Integer> list1 = new ArrayList<>();
        for (Integer integer : list) {
            boolean test = predicate.test(integer);
            if (test) {
                list1.add(integer);
            }
        }
        return list1;
    }

}
