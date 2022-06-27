package org.itmo.java.homework.homework3;

public class Car {
    private String name;
    private String color;
    private Double weight;

    public Car () {
    }

    public Car(String color) {
        this.color = color;
    }

    public Car(String color, Double weight) {
        this.color = color;
        this.weight = weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", weight=" + weight +
                '}';
    }
}
