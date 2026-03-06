package com.coder.homework;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/10
 */
public class No3 {
    public static void main(String[] args) {
        Employer employer=new Employer("李白", LocalDate.of(2018,2,4),8000);
        Employer employer1=new Employer("李白", LocalDate.of(2012,5,6),12000);
        Employer employer2=new Employer("李白", LocalDate.of(2014,4,10),10000);
        Employer employer3=new Employer("李白", LocalDate.of(2016,10,11),9000);
        Employer[] employers=new Employer[4];
        employers[0]=employer;
        employers[1]=employer1;
        employers[2]=employer2;
        employers[3]=employer3;
        EnterPrise enterPrise=new EnterPrise();
        enterPrise.addSalary(employers);
        enterPrise.showEmployerInfo(employers);
    }
}
