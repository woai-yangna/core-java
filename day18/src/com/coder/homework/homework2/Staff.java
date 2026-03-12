package com.coder.homework.homework2;

import java.time.LocalDate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/3/3
 */
public class Staff {
    private String employeeNumber;
    private String name;
    private String gender;
    private int age;
    private LocalDate hireDate;
    private int salary;
    private String address;

    public Staff() {
    }

    public Staff(String employeeNumber, String name, String gender, int age, LocalDate hireDate, int salary, String address) {
        this.employeeNumber = employeeNumber;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.hireDate = hireDate;
        this.salary = salary;
        this.address = address;
    }

    public String getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(String employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "employeeNumber='" + employeeNumber + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", hireDate=" + hireDate +
                ", salary=" + salary +
                ", address='" + address + '\'' +
                '}';
    }
}
