package org.itmo.java.lesson3;

public class Singleton {
    private static Singleton instance;

    private Singleton() { //запрещает создание через конструктор

    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
