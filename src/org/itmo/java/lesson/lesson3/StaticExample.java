package org.itmo.java.lesson.lesson3;

public class StaticExample {
    public static final String STATIC_CONSTANT = "Some constant";
    public String string;
    private static String staticString;
    private final String nonStaticString;
    protected String protectedString;
    Integer defaultInteger;
    //public>protected(in package and in inherited)>(no modif = in package)>private
    //final - не изменяемое; способное получить первое значение

    static {
        System.out.println("============");
        System.out.println("static block start");
        staticString = "staticString";
        System.out.println(staticString);
        System.out.println("static block end");
        System.out.println("============");
    }

    {
        System.out.println("============");
        System.out.println("non-Static block start");
        nonStaticString = "non-Static";
        System.out.println(staticString);
        System.out.println("non-Static block end");
        System.out.println("============");
    }

    public static void printStaticVar() {
        System.out.println(staticString + " in a static method");
    }

    public void printNonStaticMethod() {
        printStaticVar();
        staticString = "123";
    }

    public static void main(String[] args) {
        StaticExample staticExample = new StaticExample();
        staticExample.printNonStaticMethod();

        Integer integer = null;
        int i = integer.parseInt("123");
        System.out.println(integer);
        System.out.println(i);
    }
}
