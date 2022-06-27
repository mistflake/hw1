package org.itmo.java.homework.homework2;

/*
 * 1) Создать класс Calculator. У него должны быть методы:
 * -	Сумма
 * -	Деление
 * -	Умножение
 * -	Вычитание
 * Все методы должны быть перегружены и работать с тремя типами данных- double, long и int.
 *
 * 2) Создать класс, который обозначает какую-либо сущность.
 * Определить у него несколько конструкторов - конструктор по умолчанию и конструктор со всеми параметрами.
 * Определить для него несколько параметров.
 */

public class Main {
    public static void main(String[] args) {
        //Calculator calculator = new Calculator();

        System.out.println(Calculator.div(4L, 5L));
        System.out.println(Calculator.div(211D, 14D));
        System.out.println(Calculator.div(4L, 0));
    }
}
