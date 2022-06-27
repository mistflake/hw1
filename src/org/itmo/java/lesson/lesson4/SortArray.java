package org.itmo.java.lesson.lesson4;

import java.util.Arrays;

public class SortArray {
    //прочитать про big O notation
    //лекция гарварда про сортировки

    //пузырьковая сортировка
    public static void main (String[] args) {
        int[] ints = {44, 231, 34, 54, 55, 435, 76, 87, 2, 3, 25};
        int[] ints1 = mergeSort(ints);
        System.out.println(Arrays.toString(ints1));
    }
        public static int[] bubbleSortedArray(int[] array){
            //хороша только на небольших объёмах данных
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array.length; j++) {
                    if (array[j] > array[i]) {
                        int aj = array[j];
                        int ai = array[i];
                        array[j] = ai;
                        array[i] = aj;
                    }
                }
            }
            System.out.println(Arrays.toString(array));

            return array;
    }

    public static int[] mergeSort(int[] array) {
        System.out.println(Arrays.toString(array));
        if (array.length<2) {
            return array;
        }

        int mid = array.length / 2;
        int[] left = new int[mid];
        int[] right;

        if (array.length % 2 ==0) {
            right = new int[mid];
        } else {
            right = new int[mid+1];
        }

        for (int i = 0; i < left.length; i++) {
            left[i] = array[i];
        }
        for (int i = 0; i < right.length; i++) {
            right[i] = array[mid+i];
        }

        left = mergeSort(left);
        right = mergeSort(right);

        return mergeParts(left,right);
    }

    private static int[] mergeParts(int[] left, int[] right) {
        int[] result = new int[left.length+ right.length];

        int leftPointer = 0;
        int rightPointer = 0;
        int resultPointer = 0;

        while (leftPointer<left.length || rightPointer<right.length) {
            if (leftPointer < left.length && rightPointer < right.length) {
                if (left[leftPointer]<right[rightPointer]) {
                    result[resultPointer++] = left[leftPointer++];
                } else {
                    result[resultPointer++] = right[rightPointer++];
                }
            } else if (leftPointer < left.length) {
                result[resultPointer++] = left[leftPointer++];
            } else {
                result[resultPointer++] = right[rightPointer++];
            }
        }

        return result;
    }
}
