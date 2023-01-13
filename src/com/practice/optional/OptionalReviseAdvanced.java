package com.practice.optional;

import java.util.Optional;

public class OptionalReviseAdvanced {

    public static void main(String[] args) {
        //Creating 2 types of emp objects.
        //1. empty/null emp object
        //2. not null emp object
        Employee empEmpty = new Employee();
        Employee emp = new Employee(0, "AB", "ab@gmail.com");


        System.out.println("//================================================================================");
        Optional<Employee> empOptional = Optional.ofNullable(emp);
        //Optional<Employee> empOptional = Optional.ofNullable(empEmpty);

        //object check methods
        System.out.println(empOptional.isEmpty());
        System.out.println(empOptional.isPresent());

        System.out.println("//================================================================================");

        //conditional methods
        empOptional.ifPresent(employee -> System.out.println("yes, EMP object is present and do this now"));
        empOptional.ifPresentOrElse(
                employee -> System.out.println("If EMP is present then run this code"),
                () -> System.out.println("or else run this code"));

        System.out.println("//================================================================================");

        //can be used in as a default object return scenario
        //returns an object by default
        Employee employee1 = empOptional.orElse(new Employee());
        System.out.println(employee1);

        //can be used in as a default code to run in case emp is not present
        //calls a function and lines of code can be executed before returning the emp object
        Employee employee2 = empOptional.orElseGet(() -> {
            //do something here like customizing the emp object
            Employee customEmp = new Employee();
            customEmp.setId(44);
            customEmp.setName("Custom Employee Name");
            customEmp.setEmail("customeEmp@test.com");
            return customEmp;
        });
        System.out.println(employee2);

        /*  SUMMARY:
            orElse() will ALWAYS call the given function whether you want it or not, regardless of Optional.isPresent() value
            orElseGet() will ONLY call the given function when the Optional.isPresent() == false
         */

        System.out.println("//================================================================================");

        Employee employee3 = empOptional.orElseThrow();
        System.out.println(employee3);

        try {
            empOptional.orElseThrow(() -> {
                //do something here
                return new Exception("Some Custom Exception Class");
            });
        } catch (Exception exception) {
            exception.printStackTrace();
        }
        System.out.println("//================================================================================");
    }

}
