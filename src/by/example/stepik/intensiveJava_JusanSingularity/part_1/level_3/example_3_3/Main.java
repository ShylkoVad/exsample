package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_3.example_3_3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /**
         * Реализовать функцию median, которое находится в середине массива, если его упорядочить по возрастанию,
         * то есть такое число, что половина из элементов набора не меньше него, а другая половина не больше.
         * Если кол-во элементов в массиве четное, то нужно вернуть левое значение медианы.
         */
        System.out.println(median(new int[]{7, 5, 1, 4}));

        /**
         *Дается массив чисел, найти в массиве такой элемент, где сумма чисел слева равна сумме чисел справа.
         * Если такое число есть, то вернуть true, в противном случае false.
         */
        System.out.println(perfectlyBalanced(new int[]{1, 2, 9, 8, 5, 7}));

        /**
         * Два друга хотят скинуться, чтобы купить акции на Jusan Invest. Им нужно купить две акции на всю сумму, которая у них есть.
         * Дается доступная сумма денег m и список цен на различные акции s. Напечатайте индексы акции, которые можно купить.
         * Напечатанные индексы должны быть отсортированы по возрастанию.
         * Предполагается, что такие числа всегда существуют в списке цен акции s, сумма которых равна m.
         */
        stockBuy(8, new int[]{8, 7, 3, 1, 3, 10});

    }

    public static int median(int[] array) {
        int temp;
        int number;

        if (array.length > 0) {
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j] > array[j + 1]) {
                        temp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = temp;
                    }
                }
            }
            System.out.println(Arrays.toString(array));

            int length = array.length;

            if (length % 2 != 0) {
                number = array[array.length / 2];
            } else {
                number = array[array.length / 2 - 1];
            }
        } else {
            number = 0;
        }
        return number;
    }

    public static boolean perfectlyBalanced(int[] array) {

        int sumLeft;
        int sumRight;
        if (array.length > 0) {
            for (int i = 1; i < array.length; i++) {
                sumLeft = 0;
                sumRight = 0;
                for (int j = 0; j < i; j++) {

                    sumLeft = sumLeft + array[j];
                }
                for (int q = i + 1; q < array.length; q++) {

                    sumRight = sumRight + array[q];
                }
                if (sumLeft == sumRight) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void stockBuy(int m, int[] array) {
        if (array.length > 0 && m >= 2) {
            for (int i = 0; i < array.length; i++) {
                int sum;
                int number1 = array[i];
                for (int j = 0; j < array.length; j++ ) {
                    sum = number1 + array[j];
                    if (m == sum && i < j) {
                        System.out.println(i + " " + j);
                    }
                }
            }
        }
    }

}
