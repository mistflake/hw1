package org.itmo.java.lesson.lesson1;

import java.util.Scanner;

/*
1. Выведите строки в следующем порядке: Я
хорошо знаю Java.
2. Посчитайте результат выражения
(​46 ​+ ​10​) * (​10 ​/ ​3​) (​29​) * (​4​) * (-​15​)
3. В переменной number, лежит целое число 10500. В переменной result посчитайте следующее выражение: (number / 10) / 10. Результат выведите на консоль.
4. Даны три числа: 3.6, 4.1, 5.9. В переменной result посчитайте произведение этих чисел.
5. В этой задаче вы должны считать целые числа из стандартного ввода, а затем вывести. Каждое целое число нужно печатать с новой строки. Формат ввода:
42
100
125
6. Для целого числа ​b​выполните следующие условные действия:
● Если ​b ​нечетное, выведите “Нечетное”
● Если ​b ​четное, выведите “Четное”
● Если ​b ​четное и больше 100, выведите “Выход за пределы диапазона”
! Использовать класс Scanner: ​int​b = scanner.nextInt();
 */
public class MainItmoJava {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        //BufferedReader reader = new BufferedReader (new InputStreamReader (System.in)) ;


        System.out.println("******** ex.1 ********");
        System.out.println("Я");
        System.out.println("хорошо");
        System.out.println("знаю");
        System.out.println("Java.");

        System.out.println("******** ex.2 ********");
        Double i1 = 10D/3*(46+10);
        System.out.println(i1);

        int i2 = 29*4*(-15);
        System.out.println(i2);

        System.out.println("******** ex.3 ********");
        double number = 10500D;
        System.out.println(number/10/10);

        System.out.println("******** ex.4 ********");
        double result = 3.6*4.1*5.9;
        System.out.println(result);

        System.out.println("******** ex.5 ********");
        int x5i1 =  scanner.nextInt();
        int x5i2 =  scanner.nextInt();
        int x5i3 =  scanner.nextInt();
        System.out.println(x5i1);
        System.out.println(x5i2);
        System.out.println(x5i3);

        System.out.println("******** ex.6 ********");
        int b = scanner.nextInt();

        if (b>100 && b%2==0) {
            System.out.println("Выход за пределы диапазона");
        } else {
            if (b % 2 == 0) {
                System.out.println("even");
            } else {
                System.out.println("not even");
            }
        }


    }
}
