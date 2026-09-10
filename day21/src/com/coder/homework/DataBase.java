package com.coder.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/10
 */
public class DataBase {
    private static List<Employee> list;
    static {
        list=new ArrayList<>();
        list.add(new Employee("Y1012","李白","男",29,12000,"研发部", LocalDate.of(2016,10,10)));
        list.add(new Employee("C2404","杜甫","男",28,14000,"产品部", LocalDate.of(2017,9,5)));
        list.add(new Employee("Y1035","白居易","男",27,11000,"研发部", LocalDate.of(2018,5,21)));
        list.add(new Employee("Y1089","李商隐","男",29,15000,"研发部", LocalDate.of(2016,3,19)));
        list.add(new Employee("C2675","李清照","女",24,8000,"产品部", LocalDate.of(2021,7,16)));
        list.add(new Employee("X3021","陆游","男",32,18000,"研发部", LocalDate.of(2014,12,20)));
    }
    public static List<Employee> getCurrentList(){
        return list;
    }
}
