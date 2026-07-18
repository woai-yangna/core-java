package com.coder.map.homework.homework2;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/17
 */
public class No2 {
    public static void main(String[] args) {
        List<Stundent> list = Data.getList();
       /* Map<String, Double> map = Count.sum(list);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }*/
       /* Map<String, Double> map = Count.avg(list);
        for (Map.Entry<String, Double> entry : map.entrySet()) {
            System.out.println(entry.getKey() + "\t" + entry.getValue());
        }*/
        /*double sum = Count.sum(list, "语文");
        System.out.println(sum);*/
        /*double c=Count.avg(list,"语文");
        System.out.println(c);*/
        /*int i = Count.countFail(list);
        System.out.println(i);*/
        Count.add10(list);
        int i = Count.countFail(list);
        System.out.println(i);
        Count.show(list);
    }
}
