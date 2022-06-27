package org.itmo.java.lesson.lesson4;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArray = new int[10];

        intArray[0] = 20;
        intArray[1] = 23;
        intArray[2] = 244;
        intArray[3] = 202;
        intArray[4] = 210;
        intArray[5] = 230;
        intArray[6] = 2330;

        System.out.println(Arrays.toString(intArray));

        String[] strings = new String[5];

        long[] longs = new long[]{123L,321L,333L};

        //Idea fori = new for... cycle

        for (int i = 0; i < longs.length; i++) {

        }

        //iter = foreach

        // break - OUT OF CYCLE
        // continue - RETURN TO NEXT CYCLE ROUND


        //SORTING
        System.out.println(Arrays.toString(intArray));
        Arrays.sort(intArray);
        System.out.println(Arrays.toString(intArray));

        //поиск (возвращает индекс(
        System.out.println(Arrays.binarySearch(intArray,20));
        //бинарный поиск - только после сортировки

        //блиотека apache guava

    }
}
