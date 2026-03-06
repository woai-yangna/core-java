package com.coder.homework.homework1;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class No1 {
    public static void main(String[] args) {
        FinanceDepartment financeDepartment=new FinanceDepartment();
        List<Staff> list =DataBase.getList();
        int c = financeDepartment.sum(list, "C");
        System.out.println("研发部门工资总额:"+c);
        int t = financeDepartment.sum(list, "T");
        System.out.println("测试部门工资总额:"+t);
        double dc=financeDepartment.average(list,"C");
        System.out.println("研发部门平均工资:"+dc);
        double dt=financeDepartment.average(list,"T");
        System.out.println("测试部门平均工资:"+dt);


        /*PersonnelDept dept=new PersonnelDept();
        dept.removeByAddress(list,"上海市");
        DataBase.showStaffInformation();*/


        PersonnelDept dept=new PersonnelDept();
        dept.addsal(list,70);
        DataBase.showStaffInformation();

    }
}
