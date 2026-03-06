package com.coder.homework.homework1;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Iterator;
import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class PersonnelDept {
    public void removeByAddress(List<Staff>list,String address){
        for(Iterator<Staff> iterator=list.iterator();iterator.hasNext();){
            Staff staff=iterator.next();
            if (staff.getAddress().equals(address)) {
                iterator.remove();
            }
        }
    }
    public void addsal(List<Staff> list,long month){
        for(Iterator<Staff> iterator=list.iterator();iterator.hasNext();) {
            Staff staff = iterator.next();
            long workMonth= ChronoUnit.MONTHS.between(staff.getHireDate(), LocalDate.now());
            if (workMonth>=month) {
                staff.setSalary((int)(staff.getSalary()*1.1));
            }
        }
    }
}
