package com.coder.array;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/22
 */
public class TestRemove {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        /*for (String s : list) {
            if(s.equals(("AAA"))){

            }
        }*/
        Iterator<String> iterator=list.iterator();
        while(iterator.hasNext()){
            String x=iterator.next();
            if("BBB".equals(x)){
                iterator.remove();
            }
        }
        System.out.println(list);
    }
}
