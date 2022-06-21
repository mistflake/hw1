package org.itmo.java.lesson2;

public class CarService {
    public static long totalPrice(Car car, Integer servicePrice) {
        return car.getPrice() + servicePrice;
    }
}
