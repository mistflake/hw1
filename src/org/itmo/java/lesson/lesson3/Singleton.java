package org.itmo.java.lesson.lesson3;

public class Singleton {
    private static Singleton instance;

    private Singleton() { //запрещает создание через конструктор

    }

    public static Singleton getInstance() { //гарантирует единство объекта даже из разных
        if (instance == null) {
            instance = new Singleton();
        }

        return instance;
    }
}
