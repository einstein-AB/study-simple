package com.practice.multithreading;

public class MyThreadMain {
    public static void main(String[] args) {
        MyThread1 myThread1Runnable = new MyThread1();
        Thread thread = new Thread(myThread1Runnable);
        thread.start();

        Runnable runnable1 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i+". Runnable from Lambda");
            }
        };
        Thread thread1 = new Thread(runnable1);
        thread1.start();

        Runnable runnable2 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("("+i+") Runnable from Lambda");
            }
        };
        Thread thread2 = new Thread(runnable2);
        thread2.start();

        Runnable runnable3 = () -> {
            for (int i = 0; i < 10; i++) {
                System.out.println("["+i+"] Runnable from Lambda");
            }
        };
        Thread thread3 = new Thread(runnable3);
        thread3.start();


        for (int i = 0; i < 10; i++) {
            System.out.println("--------MainThread--------");
        }
    }
}
