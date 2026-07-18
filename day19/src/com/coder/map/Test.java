package com.coder.map;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/4/22
 */
public class Test {
    public static void main(String[] args) {
        Map<String,Integer> map=new LinkedHashMap<>();//对比hashmap有顺序存放
        map.put("语文",90);
        map.put("数学",80);
        map.put("英语",70);
        map.put("地理",95);
        /*System.out.println(map);*//*
        Integer math=map.get("数学");
        System.out.println("math = "+math);*/
        /*Set<String> keys = map.keySet();
        for (String key : keys) {
            System.out.println(key);
        }*/
        //效率更高
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
