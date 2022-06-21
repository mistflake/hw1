package org.itmo.java.lesson2;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMW","X5",Color.GREEN,true);
        car.setPrice(10000000);
        System.out.println(car);

        long totalPrice = CarService.totalPrice(car,2000000);
        System.out.println(totalPrice);
    }
}
