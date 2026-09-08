package com.coder.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/8
 */
public class No4 {
    public static void main(String[] args) {
        String[] names={"syk","yn","sy"};
        Integer[] ages={18,28,38};
        BiFunction<String,Integer,Student> b=Student::new;
        List<Student> list = createStudent(3, names, ages, b);
        list.forEach(System.out::println);

    }
    public static List<Student> createStudent(int x,String[] names,Integer[] ages, BiFunction<String,Integer,Student> ww){
        List<Student> list=new ArrayList<>(x);
        for (int i = 0; i < x; i++) {
            Student student = ww.apply(names[i], ages[i]);
            list.add(student);
        }
        return list;
    }
}
