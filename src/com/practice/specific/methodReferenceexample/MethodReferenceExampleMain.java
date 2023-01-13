package com.practice.specific.methodReferenceexample;


import java.util.*;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class MethodReferenceExampleMain {

    public static void main(String[] args) {
        List<String> myStrList = new ArrayList<>(Arrays.asList("1", "2", "3", "4", "5"));

        //Static method references
        List<Integer> myIntList = myStrList.stream()
                .map(Integer::parseInt)
                .collect(Collectors.toList());
        myIntList.forEach(System.out::println);


        //Instance method reference
        CustomReferenceClass customReferenceClass = new CustomReferenceClass();
        myStrList.forEach(new CustomReferenceClass()::printCollection);
        //myStrList.forEach(customReferenceClass::printCollection);

        //Constructor method reference
        Supplier<Map> myList = HashMap::new;

    }
}
