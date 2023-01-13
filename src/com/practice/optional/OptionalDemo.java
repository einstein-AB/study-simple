package com.practice.optional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class OptionalDemo {

    public static List<Employee> employeeList = Arrays.asList(

            new Employee(1, "AB", "ab@gmail.com"),
            null,
            new Employee(3, "AB", "ab@gmail.com")
    );
    public static void main(String[] args) throws Throwable {

        System.out.println("===========================**1**============================");
        //1. Get an empty optional object
        Optional emptyOptional = Optional.empty();
        System.out.println(emptyOptional); //emptyOptional.get() will yield "No value present" error

        System.out.println("===========================**2**============================");
        //2. Get an abject when you are sure that the supplied object can never be null
        /*Optional ofOptional1 = Optional.of(employeeList.get(2));
        System.out.println(ofOptional);*/ //ofOptional1.get() will yield "Null Pointer Exception"
        Optional ofOptional2 = Optional.of(employeeList.get(1));
        System.out.println(ofOptional2); //ofOptional2.get() will yield Employee object

        System.out.println("===========================**3**============================");
        //3. Get an abject when you are NOT sure that the supplied object can be null OR not null
        Optional ofNullable1 = Optional.ofNullable(employeeList.get(2));
        System.out.println(ofNullable1); //get() will yield "No value present" error


        System.out.println("===========================4============================");
        Optional ofNullable2 = Optional.ofNullable(employeeList.get(1));
        System.out.println(ofNullable2); //get() will yield some value


        System.out.println("===========================5============================");
        ofNullable2
                .ifPresent(obj -> System.out.println(obj+ " is present"));
        emptyOptional
                .ifPresent(obj -> System.out.println(obj+ " is NOT present"));

        Optional.empty()
                .ifPresentOrElse(
                        (obj) -> System.out.println(obj),
                        () -> System.out.println("Object Not Present"));


        System.out.println("===========================6============================");
        if (ofNullable2.isPresent()) {
            System.out.println("Optional Object is Present");
        } else {
            System.out.println("Optional Object NOT is Present");
        }

        System.out.println("===========================7============================");
        System.out.println(emptyOptional.orElse("7.1 Returned obj if it is not null else return this default"));
        System.out.println(ofNullable2.orElse("7.2 Returned obj if it is not null else return this default"));

        System.out.println(ofNullable2.orElseGet(()-> "7.3 Returned obj if it is not null else return this default"));
        System.out.println(ofNullable2.orElseGet(()-> "default message"));

        System.out.println(emptyOptional.orElseThrow(()-> new IllegalArgumentException("Object is empty")));

    }
}
