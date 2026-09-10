package com.coder.homework;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/10
 */
public class HandleDepartment {
    public void isOver(List<Employee> list) {
        boolean b = list.stream().filter(x -> x.getDepartment().equals("产品部")).allMatch(x -> x.getSalary() >= 10000);
        System.out.println(b);
    }

    public void judgeGender(List<Employee> list) {
        boolean b = list.stream().filter(x -> x.getDepartment().equals("研发部")).allMatch(x -> x.getGender() == "男");
        System.out.println(b);
    }

    public void check1(List<Employee> list) {
        list.stream().filter(x -> x.getDepartment().equals("研发部")).filter(x -> x.getSalary() >= 10000).filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                LocalDate now = LocalDate.now();
                LocalDate hireDate = employee.getHireDate();
                int year = now.getYear() - hireDate.getYear();
                return year >= 5;
            }
        }).forEach(System.out::println);
    }

    public void check2(List<Employee> list) {
        list.stream().filter(x -> !x.getDepartment().equals("项目部")).forEach(System.out::println);
    }

    public void check3(List<Employee> list) {
        Optional<Employee> max = list.stream().filter(new Predicate<Employee>() {
            @Override
            public boolean test(Employee employee) {
                LocalDate now = LocalDate.now();
                LocalDate hireDate = employee.getHireDate();
                int year = now.getYear() - hireDate.getYear();
                return year >= 5;
            }
        }).max(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getSalary(), o2.getSalary());
            }
        });
        System.out.println(max.get().getSalary());
    }

    public void check4(List<Employee> list) {
        Optional<Employee> min = list.stream().filter(x -> x.getDepartment().equals("研发部")).min(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return Integer.compare(o1.getAge(), o2.getAge());
            }
        });
        System.out.println(min.get());
    }
    public void check5(List<Employee> list) {
        Optional<Employee> any = list.stream().filter(x -> x.getDepartment().equals("研发部")).findAny();
        System.out.println(any.get().getNumber().charAt(0));
    }
}
