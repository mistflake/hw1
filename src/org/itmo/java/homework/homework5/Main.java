package org.itmo.java.homework.homework5;

/*
 * 1.	Написать метод для поиска самого длинного слова в тексте.
 * 2.	Написать метод, который проверяет является ли слово палиндромом.
 * 3.	Напишите метод, заменяющий в тексте все вхождения слова «бяка» на «[вырезано цензурой]».
 * 4.	Имеются две строки. Найти количество вхождений одной (являющейся подстрокой) в другую.
 * 5.	Напишите метод, который инвертирует слова в строке. Предполагается, что в строке нет знаков препинания, и слова разделены пробелами.
Sample Output:
The given string is: This is a test string
The string reversed word by word is:
sihT si a tset gnirts

https://docs.oracle.com/javase/8/docs/api/java/lang/String.html

*/

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("***** 1 *****");
        System.out.println(findLenghtiestWorldInString(scanString()));
        System.out.println("***** 2 *****");
        System.out.println(isStringPalindrome(scanString()));
        System.out.println("***** 3 *****");
        System.out.println(substituteWordInString(scanString(),"бяка","[вырезано цензурой]"));
        System.out.println("***** 4 *****");
        System.out.println(countSubtringCountInString(scanString("main string"), scanString("substring")));
        System.out.println("***** 5 *****");
        System.out.println(invertWordsInString(scanString("string to invert words")));

    }

    private static String scanString () {
        return scanString(null);
    }

    private static String scanString (String comment) {
        if (comment == null) {
            System.out.print("input text: ");
        } else {
            System.out.print(comment+": ");
        }
        return scanner.nextLine();
    }

    private static String reverseString (String inputString) {
        char[] charArray = inputString.toCharArray();
        String result = "";

        for (int i = charArray.length - 1; i >= 0; i--) {
            result = result + charArray[i];
        }

        return result;

    }

    private static String[] splitStringIntoArray (String inputString) {
        return inputString.split("\\s+");
    }


    private static String findLenghtiestWorldInString (String inputString) {
        String[] stringArray = splitStringIntoArray(inputString);

        int maxLength = 0;
        Integer maxLengthIndex = null;

        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].length() > maxLength) {
                maxLength = stringArray[i].length();
                maxLengthIndex = i;
            }
        }

        if (maxLengthIndex != null) {
            return stringArray[maxLengthIndex];
        } else {
            return null;
        }
    }

    private static boolean isStringPalindrome (String inputString) {
        return inputString.equals(reverseString(inputString));
    }

    private static String substituteWordInString (String inputString, String oldWord, String newWord) {
        String[] stringArray = splitStringIntoArray(inputString);
        for (int i = 0; i < stringArray.length; i++) {
            if (stringArray[i].equals(oldWord)) {
                stringArray[i] = newWord;
            }
        }

        return String.join(" ",stringArray);
    }

    private static int countSubtringCountInString (String inputString, String subString) {
        return inputString.split(subString).length-1;
    }

    private static String invertWordsInString(String inputString) {
        String[] stringArray = splitStringIntoArray(inputString);

        for (int i = 0; i < stringArray.length; i++) {
            stringArray[i] = reverseString(stringArray[i]);
        }

        return String.join(" ",stringArray);
    }
}
