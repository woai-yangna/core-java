package com.coder.map.homework.homework1;

import java.util.Map;
import java.util.TreeMap;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/5/8
 */
public class Station {
    private static Map<Integer,String> stationMap;
    static {
        stationMap=new TreeMap<>();
        stationMap.put(1,"沿山大道站");
        stationMap.put(2,"凤凰山站");
        stationMap.put(3,"文德路站");
        stationMap.put(4,"河滨公园站");
        stationMap.put(5,"康安路站");
        stationMap.put(6,"南京工业大学站");
        stationMap.put(7,"兴隆路站");
        stationMap.put(8,"万寿路站");
        stationMap.put(9,"国际健康中心站");
    }
    public static void showStations(){
        for (Map.Entry<Integer, String> entry : stationMap.entrySet()) {
            System.out.println(entry.getKey()+"\t"+entry.getValue());
        }
    }
    public static int mileage(String start,String end){
        Integer startIndex=getIndex(start);
        Integer endIndex=getIndex(end);
        if(startIndex==-1 || endIndex==-1){
            return -1;
        }else {
            return Math.abs(endIndex-startIndex);
        }
    }
    public static Integer getIndex(String value){
        if(stationMap.containsValue(value)){
                for (Map.Entry<Integer, String> entry : stationMap.entrySet()) {
                    if(value.equals(entry.getValue())){
                        return entry.getKey();
                    }
            }
        }
        return -1;
    }
}
