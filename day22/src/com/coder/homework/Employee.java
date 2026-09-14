package com.coder.homework;

import java.time.LocalDate;
import java.util.Objects;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/10
 */
public class Employee {
    private String number;
    private String name;
    private String gender;
    private Integer age;
    private Integer salary;
    private String depatment;
    private LocalDate hireDate;

    public Employee(String number, String name, String gender, Integer age, Integer salary, String depatment, LocalDate hireDate) {
        this.number = number;
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.salary = salary;
        this.depatment = depatment;
        this.hireDate = hireDate;
    }

    public Employee() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return depatment;
    }

    public void setDepatment(String depatment) {
        this.depatment = depatment;
    }

    public LocalDate getHireDate() {
        return hireDate;
    }

    public void setHireDate(LocalDate hireDate) {
        this.hireDate = hireDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "number='" + number + '\'' +
                ", name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", depatment='" + depatment + '\'' +
                ", hireDate=" + hireDate +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(number, employee.number) && Objects.equals(name, employee.name) && Objects.equals(gender, employee.gender) && Objects.equals(age, employee.age) && Objects.equals(salary, employee.salary) && Objects.equals(depatment, employee.depatment) && Objects.equals(hireDate, employee.hireDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, name, gender, age, salary, depatment, hireDate);
    }
}
