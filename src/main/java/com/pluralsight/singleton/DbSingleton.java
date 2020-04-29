package com.pluralsight.singleton;

public class DbSingleton {
//    Early Singleton
//    private static DbSingleton instance = new DbSingleton();

//    Lazy Singleton
    private static volatile DbSingleton instance = null;

    private DbSingleton() {
        if (instance != null)
            throw new RuntimeException("Use getInstance() method to create instance!");
    }

    public static DbSingleton getInstance() {
        if (instance == null) {
            synchronized (DbSingleton.class) {
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }
        return instance;
    }
}
