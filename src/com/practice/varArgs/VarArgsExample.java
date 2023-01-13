package com.practice.varArgs;

public class VarArgsExample {

    public static void main(String[] args) {
        dynamicMultipleArgsMethod("A", "B", "C", "D", "E", "F");
    }

    public static void dynamicMultipleArgsMethod(String... strings) {
        for (String str : strings) {
            System.out.println(str);
        }
    }

}
