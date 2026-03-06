package com.coder.array;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/16
 */
public class TestArrayList {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(10);
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
       /* for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
       /* for (String s : list) {
            System.out.println(s);
        }*/
        /*for (Iterator<String> iterator=list.iterator(); iterator.hasNext(); ) {
            System.out.println(iterator.next());
        }*/
        ListIterator<String> iterator=list.listIterator(list.size());
        iterator.previous();
        while(iterator.hasPrevious()){
            System.out.println(iterator.previousIndex()+"\t"+iterator.previous());
        }
        System.out.println(list);
    }
}
