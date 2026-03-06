package com.coder.homework;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/2/2
 */
public class Employer {
    private String name;
    private LocalDate joinDate;
    private int salary;
    private int workedMonths;

    public Employer(String name, LocalDate joinDate, int salary) {
        this.name = name;
        this.joinDate = joinDate;
        this.salary = salary;
        setWorkedMonths(TimeInterval.countMonth(joinDate));
    }

    public Employer() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDate joinDate) {
        this.joinDate = joinDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWorkedMonths() {
        return workedMonths;
    }

    public void setWorkedMonths(int workedMonths) {
        this.workedMonths = workedMonths;
    }

    @Override
    public String toString() {
        return "Employer{" +
                "name='" + name + '\'' +
                ", joinDate=" + joinDate +
                ", salary=" + salary +
                ", workedMonths=" + workedMonths +
                '}';
    }
}
