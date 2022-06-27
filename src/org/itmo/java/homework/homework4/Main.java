package org.itmo.java.homework.homework4;
/*
Часть 2
!Не использовать готовые методы для сортировки, поиска элемента и тд.
1.	Напишите программу, которая проверяет отсортирован ли массив по возрастанию. Если он отсортирован по возрастанию то
выводится “OK”, если нет, то будет выводиться текст “Please, try again”
2.	Напишите программу, которая считывает с клавиатуры длину массива (например, пользователь вводит цифру 4),
затем пользователь вводит 4 числа и на новой строке выводится массив из 4 элементов. Пример вывода:
   Array length: 4
   Numbers of array:
   5
   6
   7
   2
   Result: [5, 6, 7, 2]
3.	Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
Array 1: [5, 6, 7, 2]
Array 2: [2, 6, 7, 5]
4.	Дан массив чисел. Найдите первое уникальное в этом массиве число.
Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
5.	Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием:
https://ru.wikipedia.org/wiki/Сортировка_слиянием
6.	***Прочитать главы 1-4 “Грокаем алгоритмы”

*опционально
*/

//https://javarush.ru/groups/posts/cikly-java

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***** 1-1 *****");
        printEveryOdd(99);

        System.out.println("***** 1-2 *****");
        printEveryDivableBy35();

        System.out.println("***** 1-3 *****");
        System.out.println(sumAndCheck());

        System.out.println("***** 1-4 *****");
        System.out.println(allAreGreaterThanPrev());

        System.out.println("***** 1-5 *****");
        checkIfIntIsLastOrFirstInList(Arrays.asList(7,4,12,-3,8),8);

        System.out.println("***** 1-6 *****");
        System.out.println("contains 1 or 3: "+checkIfListContains1Or3(Arrays.asList(7,4,1,12,-3,8)));
    }

    public static void printEveryOdd (Integer countTo) {
        //1.	Напишите программу, которая выводит на консоль нечетные числа от 1 до 99. Каждое число печатается с новой строки.
        Integer counter = 1;
        while (counter<=countTo) {
            if (counter%2 != 0) {
                System.out.println(counter);
            }
            counter +=1;
        }
    }

    public static void printEveryDivableBy35 () {
        //Напишите программу, которая выводит числа от 1 до 100, которые делятся на 3, 5 и на то и другое
        List<Integer> divableBy3 = new ArrayList<>();
        List<Integer> divableBy5 = new ArrayList<>();
        List<Integer> divableBy3And5 = new ArrayList<>();
        Integer counter = 1;

        do {
            Boolean isDivableBy3 = false;
            Boolean isDivableBy5 = false;
            if (counter%3==0) {
                isDivableBy3 = true;
            }

            if (counter % 5 == 0) {
                isDivableBy5 = true;
            }

            if (isDivableBy3) {
                divableBy3.add(counter);
            }

            if (isDivableBy5) {
                divableBy5.add(counter);
            }

            if (isDivableBy3 && isDivableBy5) {
                divableBy3And5.add(counter);
            }

            counter += 1;
        } while (counter <= 100);

        System.out.println("divable by 3: "+divableBy3);
        System.out.println("divable by 5: "+divableBy5);
        System.out.println("divable by 3 and 5: "+divableBy3And5);

    }

    public static Boolean sumAndCheck (){
        System.out.println("first Integer: ");
        Integer a = scanner.nextInt();
        System.out.println("second Integer: ");
        Integer b = scanner.nextInt();
        System.out.println("sum to check against: ");
        Integer checkSum = scanner.nextInt();

        //3.	Напишите программу, чтобы вычислить сумму двух целых чисел и вернуть true, если сумма равна третьему целому числу.
        return (a + b) == checkSum;
    }

    public static Boolean allAreGreaterThanPrev () {
        /* Напишите программу, которая принимает от пользователя три целых числа ивозвращает true, если второе число больше
         * первого числа, а третье число больше второго числа.
         */

        System.out.println("first Integer: ");
        Integer a = scanner.nextInt();
        System.out.println("second Integer: ");
        Integer b = scanner.nextInt();
        System.out.println("third Integer: ");
        Integer c = scanner.nextInt();

        return b>a && c>b;
    }

    public static void checkIfIntIsLastOrFirstInList (List<Integer> list, Integer a) {
        /* Напишите программу, чтобы проверить, появляется ли число 3 как первый или последний элемент массива целых чисел.
         * Длина массива должна быть больше или равна двум
         */

        if (list.size()>=2) {
            Integer firstInList = list.get(0);
            Integer lastInList = list.get(list.size() - 1);
            System.out.println("list: " + list);
            System.out.println(a + " last or first: " + (a == firstInList || a == lastInList));
        }
    }

    public static Boolean checkIfListContains1Or3 (List<Integer> list) {
        // 6.	Напишите программу, чтобы проверить, что массив содержит число 1 или 3.
        System.out.println("list: " + list);

        for (int counter = 0; counter < list.size(); counter++) {
            if (list.get(counter) == 1 || list.get(counter) == 3) {
                return true;
            }
        }

        return false;
    }
}
