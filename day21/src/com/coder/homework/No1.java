package com.coder.homework;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/10
 */
public class No1 {
    public static void main(String[] args) {
        List<Employee> list=DataBase.getCurrentList();
        HandleDepartment handleDepartment=new HandleDepartment();
        handleDepartment.isOver(list);
        handleDepartment.judgeGender(list);
        handleDepartment.check1(list);
        handleDepartment.check2(list);//项目部门为0
        handleDepartment.check3(list);
        handleDepartment.check4(list);
        handleDepartment.check5(list);
    }

}
