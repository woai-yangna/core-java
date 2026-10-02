package com.coder.homwork;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/10/2
 */
public class No3 {
    public static void main(String[] args) throws IOException {
        List<List<String>> list=getNumber(3,5);
        list.forEach(list1 -> {
            list1.stream().sorted().forEach(x-> System.out.print("\t"+x));
            System.out.println();
        });
        String time=getTime();
        String code=getNo();
        BufferedWriter writer=new BufferedWriter(new FileWriter("d:/aa/彩票.txt"));
        writer.write("购买时间"+time);
        writer.newLine();
        writer.write("流水号"+code);
        writer.newLine();
        list.forEach((list1 -> {
            list1.stream().sorted().forEach(x->{
                try {
                    writer.write(x+"\t");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            try {
                writer.newLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }));
        writer.close();
    }
    public static List<List<String>> getNumber(int t,int z){
        Random random=new Random();
        List<List<String>> list=new ArrayList<>(z);
        for (int i = 0; i < z; i++) {
            List<String> subList=new ArrayList<>(t);
            for (int j = 0; j < t; j++) {
                subList.add("0"+random.nextInt(10));
            }
            list.add(subList);
        }
        return list;
    }
    public static String getTime(){
        return LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"));
    }
    public static String getNo(){
        Random random=new Random();
        StringBuffer str=new StringBuffer();
        for (int i = 0; i < 10; i++) {
            str.append(random.nextInt(10));
        }
        return str.toString();
    }
}
