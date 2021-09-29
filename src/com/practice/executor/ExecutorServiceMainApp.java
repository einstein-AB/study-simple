package com.practice.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorServiceMainApp {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for (int i = 0; i < 100; i++) {
            executorService.execute(()-> System.out.println(Thread.currentThread().getName()));
        }

        for (int i = 0; i < 100; i++) {
            executorService.execute(()-> System.out.println(Thread.currentThread().getName()+"::"+Thread.currentThread().getPriority()));
        }

        for (int i = 0; i < 100; i++) {
            executorService.execute(()-> System.out.println(Thread.currentThread().getName()+"::"+Thread.currentThread().getPriority()+"::"+Thread.currentThread().getThreadGroup().getName()));
        }

        executorService.shutdown();

    }
}
