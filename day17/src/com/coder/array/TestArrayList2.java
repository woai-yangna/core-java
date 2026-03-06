package com.coder.array;

import java.util.ArrayList;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/22
 */
public class TestArrayList2 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(123);
        list.add(345);
        list.add(1,666);
        System.out.println(list);
        /*list.clear();
        boolean empty = list.isEmpty();
        System.out.println(empty);*/
        ArrayList<Integer> list1=new ArrayList<>();
        list1.add(111);
        list1.add(222);
        list.addAll(1,list1);
        System.out.println(list);

        list.remove(Integer.valueOf(111));
        System.out.println(list);

        list.removeAll(list1);
        System.out.println(list);
        boolean contains = list.contains(111);
        System.out.println(contains);

        Object[] objects = list.toArray();
        for (Object object : objects) {
            System.out.println(object);
        }
        List<Integer> integers = list.subList(0, 3);
        System.out.println(integers);

    }
}
