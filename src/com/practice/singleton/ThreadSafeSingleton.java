package com.practice.singleton;

public class ThreadSafeSingleton {

    private static ThreadSafeSingleton THREAD_SAFE_SINGLETON_INSTANCE;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (THREAD_SAFE_SINGLETON_INSTANCE == null) {
            THREAD_SAFE_SINGLETON_INSTANCE = new ThreadSafeSingleton();
        }
        return THREAD_SAFE_SINGLETON_INSTANCE;
    }
}
