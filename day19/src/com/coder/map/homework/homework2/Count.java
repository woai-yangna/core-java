package com.coder.map.homework.homework2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/7/17
 */
public class Count {
    public static Map<String,Double> sum(List<Stundent> list){
        Map<String,Double> map=new HashMap<>();
        for (Stundent stundent : list) {
            double sum=0;
            Map<String, Double> scores = stundent.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                sum+=entry.getValue();
            }
            map.put(stundent.getName(),sum);
        }
        return map;
    }
    public static Map<String, Double> avg(List<Stundent> list){
        int size = list.get(0).getScores().size();
        Map<String, Double> map = sum(list);
        Map<String,Double> avgMap=new HashMap<>();
        for (Map.Entry<String, Double> ent : map.entrySet()) {
            avgMap.put(ent.getKey(),ent.getValue()/size);
        }
        return avgMap;
    }
    public static double sum(List<Stundent> list,String subject){
        double sum=0;
        for (Stundent stundent : list) {
            Map<String,Double> scores=stundent.getScores();
            for (Map.Entry<String, Double> en : scores.entrySet()) {
                if(en.getKey().equals(subject)){
                    sum+=en.getValue();
                }
            }
        }
        return sum;
    }
    public static double avg(List<Stundent> list,String subject){
        double sum=sum(list,subject);
        return sum/list.size();
    }
    public static int countFail(List<Stundent> list){
        int count=0;
        for (Stundent stundent : list) {
            Map<String, Double> scores = stundent.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if(entry.getValue()<60){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
    public static void add10(List<Stundent> list) {
        for (Stundent stundent : list) {
            Map<String, Double> scores = stundent.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                if(entry.getValue()<60){
                    scores.put(entry.getKey(),entry.getValue()*1.1);//后放进去的把原来的覆盖掉
                }
            }
        }
    }
    public static void show(List<Stundent> list){
        for (Stundent stundent : list) {
            System.out.println(stundent.getName());
            Map<String, Double> scores = stundent.getScores();
            for (Map.Entry<String, Double> entry : scores.entrySet()) {
                System.out.println(entry.getKey()+"："+entry.getValue());
            }
        }
    }
}
