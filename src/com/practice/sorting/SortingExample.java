package com.practice.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingExample {

    public static List<Employee> employeeList = Arrays.asList(
            new Employee(001, "A", 25000),
            new Employee(003, "C", 5000),
            new Employee(005, "E", 100),
            new Employee(002, "B", 50),
            new Employee(004, "D", 250),
            new Employee(006, "F", 650)
    );

    public static void main(String[] args) {
        employeeList.sort((o1, o2) -> o1.getName().compareTo(o2.getName()));
        employeeList.forEach(System.out::println);

        System.out.println("-------------------------");
        employeeList.sort(Comparator.comparingDouble(employee -> employee.getSalary()));
        employeeList.forEach(System.out::println);

        System.out.println("-------------------------");
        Collections.sort(employeeList, Comparator.comparing(employee -> employee.getId()));
        employeeList.forEach(System.out::println);

        System.out.println("-------------------------");
        List<Employee> sortedEmployeeList = employeeList.stream()
                .sorted(Comparator.comparing(employee -> employee.getName()))
                .collect(Collectors.toList());

    }



}
