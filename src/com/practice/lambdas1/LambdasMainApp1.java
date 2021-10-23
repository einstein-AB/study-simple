package com.practice.lambdas1;

public class LambdasMainApp1 {

    public static void main(String[] args) {

        GreetingInterface greetingInterface = new GreetingsImpl();
        greetingInterface.greetings();

        //Inner Class way of writing the implementation there itself
        GreetingInterface greetingInterface1 = new GreetingInterface() {
            @Override
            public void greetings() {
                System.out.println("Hello World from Anonymous Inner Class");
            }
        };
        greetingInterface1.greetings();

        //Lambda way
        GreetingInterface lambdaImpl = ()-> System.out.println("Hello World from Lambda");
        lambdaImpl.greetings();
    }
    
    
}