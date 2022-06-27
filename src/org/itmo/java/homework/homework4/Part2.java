package org.itmo.java.homework.homework4;

/*
Часть 2


4.
5.	Заполните массив случайным числами и отсортируйте его. Используйте сортировку слиянием:
https://ru.wikipedia.org/wiki/Сортировка_слиянием
6.	***Прочитать главы 1-4 “Грокаем алгоритмы”

*опционально
*/

//https://javarush.ru/groups/posts/cikly-java

import java.util.Arrays;

public class Part2 {
    public static void main(String[] args) {
        System.out.println("***** 1 *****");
        writeIsArraySorted(InputUtils.readIntegerArrayFromScanner());
        System.out.println("***** 2 *****");
        InputUtils.readIntegerArrayFromScannerDefeinedLength();
        System.out.println("***** 3 *****");
        System.out.println(Arrays.toString(swapLastAndFirstElementInArray(InputUtils.readIntegerArrayFromScanner())));
        System.out.println("***** 4 *****");
        System.out.println(findFirstUniqueArrayElement(InputUtils.readIntegerArrayFromScanner()));
    }

    public static void writeIsArraySorted (Integer[] array) {
        /*
         * Напишите программу, которая проверяет отсортирован ли массив по возрастанию
         * Если он отсортирован по возрастанию то выводится “OK”, если нет,
         * то будет выводиться текст “Please, try again”
         */

        if (array.length<2) {
            System.err.println("Array is shorter then 2");
        } else {
            for (int i = 1; i < array.length; i++) {
                if (array[i-1] > array[i]) {
                    System.out.println("Please, try again");
                    return;
                }
            }
        }

        System.out.println("OK");
    }

    public static Integer[] swapLastAndFirstElementInArray (Integer[] array) {
        /*
         * 3.	Напишите метод, который меняет местами первый и последний элемент массива. Пример вывода:
         * Array 1: [5, 6, 7, 2]
         * Array 2: [2, 6, 7, 5]
         */

        if (array.length<2) {
            System.err.println("array should be at least 2 elements long");
            return array;
        }

        Integer bubble = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = bubble;

        return array;
    }

    public static Integer findFirstUniqueArrayElement (Integer[] array) {
        /*
         * Дан массив чисел. Найдите первое уникальное в этом массиве число.
         * Например, для массива [1, 2, 3, 1, 2, 4] это число 3.
         */

        for (int i = 0; i < array.length; i++) {
            boolean isDuplicated = false;
            for (int j = 0; j < array.length; j++) {
                if (i!=j && array[i].equals(array[j])) {
                    isDuplicated = true;
                    break;
                }
            }

            if (!isDuplicated) {
                return array[i];
            }
        }

        return null;
    }
}
