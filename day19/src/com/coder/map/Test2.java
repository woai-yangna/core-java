package com.coder.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/4/22
 */
public class Test2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请录入一个字符串");
        String str=sc.next();
        Map<Character,Integer> map=new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(map.containsKey(c)){
                map.put(c,map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        Set<Map.Entry<Character, Integer>> entries = map.entrySet();
        for (Map.Entry<Character, Integer> entry : entries) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
}
