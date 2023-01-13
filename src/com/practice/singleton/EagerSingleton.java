package com.practice.singleton;

public class EagerSingleton {

    private static final EagerSingleton EAGER_SINGLETON_INSTANCE = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return EAGER_SINGLETON_INSTANCE;
    }
}
