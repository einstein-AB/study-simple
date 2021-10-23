package com.practice.lambdas2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class LambdasMainApp2 {

    public static List<Person> personList = new ArrayList<>(Arrays.asList(
            new Person("A", "Z", 29),
            new Person("B", "Y", 29),
            new Person("C", "X", 29),
            new Person("D", "W", 29),
            new Person("E", "V", 29),
            new Person("AA", "ZZ", 29)
            ));

    public static void main(String[] args) {

        List<Integer> number = Arrays.asList(2,3,4,5);
        int even = number.stream()
                .filter(x-> x%2==0)
                .reduce(0,(ans,i)-> ans+i);
        System.out.println(">>>>>>>>"+even+"<<<<<<<<");

        /**
         * reduce(identity, accumulator, combiner)
         * 0 ->
         * ans=0 || i=next element in the stream iteration is automatically assigned
         * ans+1 -> operation to be performed (repeatedly  adding all elements).
         * Here all even elements are added as filter is used before reduce)
         */

        //Sort by first name
        System.out.println("Person sorted by first name");
        personList.sort((o1, o2) -> o1.getFirstName().compareTo(o2.getFirstName()));
        printAllByCondition(
                personList,
                (person -> true),
                (person) -> System.out.println(person));

        //Sort by last name
        System.out.println("Person sorted by last name");
        personList.sort((o1, o2) -> o1.getLastName().compareTo(o2.getLastName()));
        printAllByCondition(
                personList,
                (person) -> true,
                ((person) -> System.out.println(person)));

        //Print ALL person whose first name starting with 'A'
        System.out.println("ALL Person whose first name starting with 'A'");
        printAllByCondition(
                personList,
                ((person) -> person.getFirstName().startsWith("A")),
                ((person) -> System.out.println(person.getFirstName())));
    }

    public static void printAllByCondition(List<Person> personList, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person person : personList) {
            if (predicate.test(person)) {
                consumer.accept(person);
            }
        }

    }

}
