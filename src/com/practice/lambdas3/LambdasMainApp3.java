package com.practice.lambdas3;

public class LambdasMainApp3 {

    public static void main(String[] args) {
        Calculator calculator = (a, b) -> System.out.println(String.format("Summation of both a and b is : %d", a+b));
        calculator.sum(2, 3);
    }
}
