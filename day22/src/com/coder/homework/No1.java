package com.coder.homework;

import java.util.List;

/**
 * @author suyongkang
 * @project core-java
 * @date 2026/9/14
 */
public class No1 {
    public static void main(String[] args) {
       List<Employee> list=DataBase.getCurrentList();
       //1
       /* Stream<String> distinct = list.stream().map(Employee::getDepartment).distinct();
        List<String> collect = distinct.collect(Collectors.toList());
        collect.forEach(System.out::println);*/
        //2
        /*Optional<Employee> min = list.stream().min(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getHireDate().compareTo(o2.getHireDate());
            }
        });
        System.out.println(min.get().getHireDate());*/
        //3
        /*int sum = list.stream().filter(x -> x.getDepartment().equals("研发部")).mapToInt(Employee::getSalary).sum();
        System.out.println(sum);
        OptionalDouble average = list.stream().filter(x -> x.getDepartment().equals("研发部")).mapToInt(Employee::getSalary).average();
        System.out.println(average);*/
        //4
        /*long c = list.stream().filter(s -> s.getName().startsWith("李")).count();
        System.out.println(c);*/
        //5
        /*list.stream().sorted(Comparator.comparingInt(Employee::getAge).thenComparingInt(Employee::getSalary)).forEach(System.out::println);*/
        //6
        /*list.stream().sorted(Comparator.comparing(Employee::getHireDate).reversed()).forEach(System.out::println);*/
        //7
        /*Map<String, List<Employee>> collect = list.stream().collect(Collectors.groupingBy(s -> {
            if (s.getName().length() == 2) {
                return "两个字符";
            } else {
                return "三个字符";
            }
        }));
        collect.forEach((k,v)-> System.out.println(k+"/t"+v));*/
        //8
        /*list.stream().filter(s->s.getDepartment().equals("产品部")).filter(s->s.getSalary()<10000).map(s->{
            s.setSalary(s.getSalary()+1000);
            return s;
        }).forEach(System.out::println);*/
        //9
        /*list.stream().map(Employee::getNumber).sorted().forEach(System.out::println);*/
        //10
        String[] names = list.stream()
                .map(Employee::getName)
                .toArray(String[]::new);
    }
}
