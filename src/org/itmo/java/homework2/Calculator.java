package org.itmo.java.homework2;

public class Calculator {
    public static int summ(int varA, int varB) {
        return varA + varB;
    }

    public static double summ(double varA, double varB) {
        return varA + varB;
    }

    public static long summ(long varA, long varB) {
        return varA + varB;
    }


    public static Double div(int varA, int varB) {
        if (varB != 0) {
            return (double) varA / varB;
        } else {
            System.err.println("DIV/0!");
            return null;
        }
    }

    public static Double div(double varA, double varB) {
        if (varB != 0) {
            return varA / varB;
        } else {
            System.err.println("DIV/0!");
            return null;
        }
    }

    public static Double div(long varA, long varB) {
        if (varB != 0) {
            return (double) varA / varB;
        } else {
            System.err.println("DIV/0!");
            return null;
        }
    }


    public static double multi(int varA, int varB) {
        return  varA * varB;
    }

    public static double multi(double varA, double varB) {
        return varA * varB;
    }

    public static double multi(long varA, long varB) {
        return varA * varB;
    }


    public static int sub(int varA, int varB) {
        return varA - varB;
    }

    public static double sub(double varA, double varB) {
        return varA - varB;
    }

    public static long sub(long varA, long varB) {
        return varA - varB;
    }

}
