package com.coder.link;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/10
 */
public class Test {
    public static void main(String[] args) {
        MyLinkedList<String> list=new MyLinkedList<>();
        list.add("AAA");
        list.add("BBB");
        list.add("CCC");
        list.add("DDD");
        list.add(0,"XXXX");
        list.add(3,"YYYY");
      /*  for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }*/
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
    }
}
