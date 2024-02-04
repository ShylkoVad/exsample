package by.example.stepik.intensiveJava_JusanSingularity.part.level_4.example_4_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * Факториал - это произведение чисел от 1 до n включительно. Обозначается математическим выражением n!.
         * Факториал 5! = 1 * 2 * 3 * 4 * 5 равен 120.
         * Реализуйте метод iterFactorial, который принимает число n и возвращает его факториал.
         * Напишите решение с использованием цикла for.
         */
        System.out.println(iterFactorial(9));

        /**
         * Реализуйте метод recursiveFactorial, который принимает число n и возвращает его факториал.
         * Напишите решение с использованием рекурсии.
         * Запрещено использовать циклы.
         */
        System.out.println(recursiveFactorial(9));

        /**
         * Числа Фибоначи - это элементы числовой последовательности. Числа Фибоначчи при визуализации представляют золотую спираль.
         * Последовательность выглядит так
         * 0, 1, 1, 2, 3, 5, 8, 13
         * Первые два числа равны 0 и 1, каждое следующее число равно сумме предыдущих двух чисел.
         * Реализуйте метод iterFibonacci, который принимает число n и возвращает n-ное число из последовательности.
         * Напишите решение с использованием цикла for.
         */
        System.out.println(iterFibonacci(8));

        /**
         * Реализуйте метод recursiveFibonacci, который принимает число n и возвращает n число из последовательности.
         * Напишите решение с использованием рекурсии.
         * Запрещено использовать циклы.
         */
        System.out.println(recursiveFibonacci(8));

        /**
         * Реализуйте метод recursivePow, который возвращает число a возведенное в степень b.
         * Напишите решение с использованием рекурсии.
         * Запрещено использовать циклы.
         */
        System.out.println(recursivePow(5, 5));

        /**
         * Простые числа - это числа, которые делятся только на 1 и на себя. Простые числа широко используются в криптографии.
         * Реализуйте метод iterIsPrime, который определяет является ли число n простым числом.
         * Напишите решение с использованием цикла for.
         */
        System.out.println(iterIsPrime(35));

        /**
         * Реализуйте метод iterPrime, который принимает число n и возвращает n-ное простое число.
         * Напишите решение с использованием цикла for.
         */
        System.out.println(iterPrime(5));

        /**
         * Реализуйте метод recursiveReversePrint, который принимает массив символов c и число k.
         * Напечатайте символы в массиве задом на перед без использования for.
         * При запуске функции значение k = c.length.
         * Решите с помощью рекурсии.
         * Запрещено использовать циклы.
         */
        recursiveReversePrint(new char[]{'h', 'e', 'l', 'l', 'o'}, 5);

    }

    public static int iterFactorial(int n) {
        int fact = 1;
        for (int i = 1; i < n; i++) {
            fact = fact * (i + 1);
        }
        return fact;
    }

    public static int recursiveFactorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * recursiveFactorial(n - 1);
        }
    }

    public static int iterFibonacci(int n) {
        int result = 1;
        int a = 0;
        int b = 1;
        if (n == 1) {
            return 0;
        } else if (n > 1) {
            for (int i = 2; i <= n - 1; i++) {
                result = a + b;
                a = b;
                b = result;
            }
        }
        return result;
    }

    public static int recursiveFibonacci(int n) {

        int result = 1;
        if (n == 1) {
            return 0;
        }
        if (n > 1) {
            result = recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
        }
        return result;
    }

    public static int recursivePow(int a, int b) {
        if (b == 1) {
            return a;
        } else {
            return a * recursivePow(a, b - 1);
        }
    }

    public static boolean iterIsPrime(int n) {

        if (n > 0) {
            for (int i = 2; i <= n; i++) {
                if ((n % i) == 0 && n != i) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int iterPrime(int n) {

        int number = 2;
//        for (int j = 0; j <= n; j++ ) {
//
//            }
        return number;
    }

    public static void recursiveReversePrint(char[] c, int k) {

        if (k > 0) {
            System.out.print(c[k - 1]);
            recursiveReversePrint(c, k - 1);
        }
    }


}
