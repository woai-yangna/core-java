package com.coder.homework.homework2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/6
 */
public class No2 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(1000);
        Random random=new Random();
        for (int i = 0; i < 1000; i++) {
            list.add(Phone.getPhoneNumber(random));
        }
        List<String> list1=new ArrayList<>(4);
        for (int i = 0; i < 4; i++) {
            int i1 = random.nextInt(list.size());
            list1.add(list.get(i1));
        }
        System.out.println(list1);
        /*for (String s : list1) {
            new StringBuffer(s).replace(3,7,)

        }*/
        for(ListIterator<String> iterator=list1.listIterator();iterator.hasNext();){
            iterator.set(new StringBuffer(iterator.next()).replace(3,7,"****").toString());
        }
        for (String s : list1) {
            System.out.println(s);
        }
    }
}
