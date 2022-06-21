package org.itmo.java.homework3;

public class Tree {
    private Integer age;
    private Boolean isAlive;
    private String name;

    public Tree() {
        System.out.println("Пустой конструктор без параметров сработал");
    }

    public Tree(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public Tree(Integer age, Boolean isAlive, String name) {
        this.age = age;
        this.isAlive = isAlive;
        this.name = name;
    }
}
