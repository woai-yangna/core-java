package com.coder.link;

import java.util.LinkedList;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/10
 */
public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> list=new LinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.addFirst("XXX");
        list.addLast("ddd");
        list.add(2,"YYY");
        /*for (String s : list) {
            System.out.println(s);
        }*/
        list.removeFirst();
        list.removeLast();
    }
}
