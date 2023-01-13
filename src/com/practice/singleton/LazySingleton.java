package com.practice.singleton;

public class LazySingleton {

    private static LazySingleton LAZY_SINGLETON_INSTANCE;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (LAZY_SINGLETON_INSTANCE == null) {
            LAZY_SINGLETON_INSTANCE = new LazySingleton();
        }
        return LAZY_SINGLETON_INSTANCE;
    }
}
