package com.coder.homework.homework2;

import java.time.LocalDate;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/12
 */
public class No2 {
    public static void main(String[] args) {
        List<Staff> list=DataBase.getList();
        Collections.sort(list, new Comparator<Staff>() {
            @Override
            public int compare(Staff o1, Staff o2) {
                LocalDate hireDate= o1.getHireDate();
                LocalDate hireDate1= o2.getHireDate();
                int i=hireDate.compareTo(hireDate1);
                if(i==0){
                    return Integer.compare(o2.getSalary(),o1.getSalary());
                }
                return hireDate.compareTo(hireDate1);
            }
        });
        for (Staff staff : list) {
            System.out.println(staff);
        }
        list=list.subList(0,3);
        for (Staff staff : list) {
            System.out.println(staff);
        }
        
    }
}
