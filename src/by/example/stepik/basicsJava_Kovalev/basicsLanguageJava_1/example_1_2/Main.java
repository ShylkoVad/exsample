package by.example.stepik.basicsJava_Kovalev.basicsLanguageJava_1.example_1_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /**
         * Создайте две переменные: целого типа a и действительного b,
         * равные 5 и 0.4 соответственно. Выведите построчно на экран их сумму, разность, произведение и частное.
         */
        // myProgram();

        /**
         * Напишите программу, которая считывает три целых числа и выводит их произведение.
         */
        // myProgramm_1();

        /**
         * Напишите программу, которая считывает целое число и выводит текст, аналогичный приведенному в примере.
         * Пробелы, знаки препинания, заглавные и строчные буквы важны!
         * Вводится целое число, по модулю не превосходящее 10000.
         * Выведите сначала фразу "The next number for the number ", затем введенное число, затем слово " is ",
         * окруженное пробелами, затем формулу для следующего за введенным числа, наконец, знак точки без пробела.
         * Аналогично в следующей строке для предыдущего числа.
         */
        // myProgramm_2();

        /**
         * На одной строчке через пробел записаны два целых числа: длина и ширина прямоугольника.
         * Вычислите его площадь и периметр (именно в таком порядке). Результат выведите на разных строках.
         */
        // myProgramm_3();

        /**
         * Дано целое число n. Выведите следующее за ним четное число.
         * При решении этой задачи нельзя использовать условную инструкцию if и циклы.
         * Подсказка: Подумайте, что будет оставаться в остатке при делении на 2 у чётных и у нечётных чисел.
         */
        // myProgramm_4();

        /**
         * Пирожок в столовой стоит a рублей и b копеек. Определите, сколько рублей и копеек нужно заплатить за n пирожков.
         * Программа получает на вход три числа: a, b, n.
         * Программа должна вывести два числа: стоимость покупки в рублях и копейках.
         */
        myProgramm_5();
    }

    public static void myProgram() {
        int a = 5;
        double b = 0.4;
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
    }

    public static void myProgramm_1() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println(a * b * c);
    }

    public static void myProgramm_2() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("The next number for the number " + a + " is " + (a + 1) + ".");
        System.out.println("The previous number for the number " + a + " is " + (a - 1) + ".");
    }

    public static void myProgramm_3() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a * b);
        System.out.println((a + b) * 2);
    }

    public static void myProgramm_4() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println(a + 2 - a % 2);
    }

    public static void myProgramm_5() {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int n = sc.nextInt();
        int result = a * n * 100 + b * n ;

        System.out.println(result);

    }

}
