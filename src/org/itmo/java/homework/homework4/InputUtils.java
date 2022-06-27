package org.itmo.java.homework.homework4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class InputUtils {
    static Scanner scanner = new Scanner(System.in);

    public static Integer[] readIntegerArrayFromScannerDefeinedLength () {
        System.out.print("array length: ");
        Integer arrayLength = scanner.nextInt();

        return readIntegerArrayFromScanner(arrayLength);
    }

    public static Integer[] readIntegerArrayFromScanner () {
        return readIntegerArrayFromScanner(null);
    }

    public static Integer[] readIntegerArrayFromScanner (Integer elementsSize) {
        List<Integer> interResult = new ArrayList<>();
        int counter = 0;

        if (elementsSize == null) {
            elementsSize = -1;
        } else {
            if (elementsSize<1) {
                System.err.println("Can not work with zero or negative array sizes");
                return null;
            }
        }

        if (elementsSize > 0) {
            System.out.println("    input " + elementsSize + " array elements");
        } else {
            System.out.println("    input array element; or '999' to end");
        }


        do {
            counter++;
            System.out.print(interResult+": ");

            int input = scanner.nextInt();
            if (input == 999 && elementsSize <=0) {
                break;
            }

            interResult.add(input);
        } while (counter!=elementsSize);

        Integer[] result = new Integer[interResult.size()];
        result = interResult.toArray(result);

        System.out.println("Array created: "+ Arrays.toString(result));
        return result;
    }
}
