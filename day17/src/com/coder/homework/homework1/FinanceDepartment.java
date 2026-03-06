package com.coder.homework.homework1;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class FinanceDepartment {
    public int sum(List<Staff>list,String prefix){
        int sum=0;
        for (Staff staff : list) {
            if (staff.getEmployeeNumber().startsWith(prefix)) {
                sum+= staff.getSalary();
            }
        }
        return sum;
    }
    public double average(List<Staff>list,String prefix){
        int count=0;
        for (Staff staff : list) {
            if (staff.getEmployeeNumber().startsWith(prefix)) {
                count++;
            }
        }
        int sum=sum(list,prefix);
        return sum*1.0/count;
    }
}
