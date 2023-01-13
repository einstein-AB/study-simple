package com.practice.optional;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class OptionalReviseBasic {

    public static void main(String[] args) {

        Employee empEmpty = new Employee();
        Employee emp = new Employee(0, "AB", "ab@gmail.com");

        //empty()
        System.out.println("==============empty()==============");
        Optional<Employee> empty = Optional.empty();
        System.out.println("empty() : "+empty.isEmpty());
        System.out.println("isPresent() : "+empty.isPresent());


        //of()
        System.out.println("==============of()==============");
        Optional<Employee> nonEmpty = Optional.of(emp);
        System.out.println("empty() : "+nonEmpty.isEmpty());
        System.out.println("isPresent() : "+nonEmpty.isPresent());


        //ofNullable()
        System.out.println("==============ofNullable()==============");
        List<Integer> intList = IntStream.rangeClosed(1, 10)
                .boxed()
                .collect(Collectors.toList());
        Collections.shuffle(intList);
        intList.forEach(integer -> {
            //emp obj will be present for EVEN values like 2, 4, 6, 8 and 10
            //emp obj will be empty/null for ODD values like 1, 3, 5, 7 and 9
            Optional<Employee> superimposedEmp = integer%2 == 0 ? Optional.of(emp) : Optional.empty();
            System.out.println(String.format("ofNullable() for %d: %s)", integer, superimposedEmp.isEmpty()));
            System.out.println(String.format("ofNullable() for %d: %s)", integer, superimposedEmp.isPresent()));
            System.out.println("***********");
        });
    }
}
