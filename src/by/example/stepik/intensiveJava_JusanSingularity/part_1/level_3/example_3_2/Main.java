package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_3.example_3_2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        /**
         * Реализовать функцию max, которая возвращает максимальное число из массива. Если массив пустой, верните 0.
         */
        System.out.println(max(new int[]{7, 5, 9, 1, 4}));

        /**
         * Реализовать функцию range, которая создает массив размером n, заполняет ячейки значениями от 1 до n и возвращает созданный массив.
         */
        System.out.println(Arrays.toString(range(10)));

        /**
         * Имплементировать метод equal, который принимает 2 массива типа []int и возвращает true, если оба массива идентичны, false в противоположном случае.
         */

        System.out.println(equal(new int[]{1, 1, 3}, new int[]{1, 1, 3}));

        /**
         * Реализовать функцию min, которая возвращает минимальное число из массива. Если в массиве нет элементов, верните 0.
         */
        System.out.println(min(new int[]{1, 2, 3}));

        /**
         * Реализовать функцию sum, которая возвращает сумму чисел массива.
         */
        System.out.println(sum(new int[]{1, 2, 3}));

        /**
         * Реализовать функцию mean, которая возвращает среднее значение чисел массива. Если в массиве нет элементов, верните 0.
         */
        System.out.println(mean(new int[]{7, 5, 9, 1, 4}));

        /**
         * Реализовать функцию range_min_max, которая принимает массив array(int[]), числа min и max.
         * Функция должна вернуть массив из элементов array, где каждый элемент больше min включительно и меньше max включительно.
         */

    }


    public static int max(int[] array) {
        int maxNumber = 0;
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
            }
        }
        return maxNumber;
    }

    public static int[] range(int n) {
        int[] range = new int[n];
        for (int i = 0; i < range.length; i++) {
            range[i] = i + 1;
        }
        return range;
    }

    public static boolean equal(int[] array1, int[] array2) {
        boolean equals = true;
        if (array1.length == array2.length) {
            for (int i = 0; i < array1.length; i++) {
                if (array1[i] == array2[i]) {
                    equals = true;
                } else {
                    equals = false;
                }
            }
        } else {
            equals = false;
        }
        return equals;
    }

    public static int min(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int minNumber = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] < minNumber) {
                minNumber = array[i];
            }
        }
        return minNumber;
    }

    public static int sum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int mean(int[] array) {
        if (array.length == 0) {
            return 0;
        }
        int mean = 0;
        for (int i = 0; i < array.length; i++) {
            mean = mean + array[i];
        }
        return mean / array.length;
    }


}
