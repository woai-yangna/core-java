package com.coder.homework;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/10
 */
public class EnterPrise {
    public void addSalary(Employer[] employers){
        for (Employer employer : employers) {
            if(employer.getWorkedMonths()>=100){
                employer.setSalary(employer.getSalary()+1000);
            }
        }
    }
   public void showEmployerInfo(Employer[] employers){
       for (Employer employer : employers) {
           System.out.println(employer);
       }
   } 
}
