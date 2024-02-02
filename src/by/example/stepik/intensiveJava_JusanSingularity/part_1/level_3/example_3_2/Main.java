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
        System.out.println(Arrays.toString(rangeMinMax(new int[]{7, 5, 9, 1, 4}, 3, 5)));

        /**
         * Реализовать функцию slice, которая принимает массив array(int[]), числа from и to.
         * Функция должна вернуть элементы массива array от индекса from (включая from) и до to.
         */
        System.out.println(Arrays.toString(slice(new int[]{7, 5, 9, 1, 4}, 0, 4)));

        /**
         * Реализовать функцию swap, которая принимает массив array(int[]), числа i и j.
         * Функция должна поменять местами в массиве два числа по указанным индексам i и j.
         */
        swap(new int[]{7, 5, 9, 1, 4}, 0, 1);

        /**
         * Реализовать функцию reverse, которая принимает массив array(int[]).
         * Функция должна перевернуть массив, то есть первый элемент становится последним, второй предпоследним, ...,
         * последний элемент первым.
         */
        reverse(new int[]{7, 5, 9, 1, 4});

        /**
         * Реализовать функцию join, которая принимает массивы array1 и array2.
         * Функция должна объединить оба массива в один и вернуть новый сложившийся.
         */
        System.out.println(Arrays.toString(join(new int[]{7, 5, 9, 1, 4}, new int[]{1, 2, 3, 4, 5})));

        /**
         * Реализовать функцию sort, которая принимает массив array(int[]). Функция должна отсортировать массив по возрастанию.
         * Подсказка: https://habr.com/ru/post/204600/
         * Запрещено использовать Arrays.sort.
         */
        sort(new int[]{7, 5, 9, 1, 4});

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

    public static int[] rangeMinMax(int[] array, int min, int max) {

        int n = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                n = n + 1;
            }
        }

        int[] arrayNew = new int[n];

        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] >= min && array[i] <= max) {
                arrayNew[j] = array[i];
                j++;

            }
        }
//        System.out.println("длина нового массива - " + n);
//        System.out.println(Arrays.toString(array));

        return arrayNew;
    }

    public static int[] slice(int[] array, int from, int to) {

        int n = to - from;
        System.out.println(n);
        int[] arrayNew = new int[n];

        for (int i = from, j = 0; i < to; i++) {
            arrayNew[j] = array[i];
            j++;
        }

        return arrayNew;
    }

    public static void swap(int[] array, int i, int j) {

        if (array.length != 0 && i >= 0 && j >= 0) {

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

            System.out.println(Arrays.toString(array));
        }
    }

    public static void reverse(int[] array) {

        if (array.length != 0) {
            for (int i = 0, j = 1; i < array.length / 2; i++) {
                int temp = array.length - j;
                int q;
                q = array[temp];
                array[temp] = array[i];
                array[i] = q;
                j++;
            }
        }
        System.out.println(Arrays.toString(array));
    }

    public static int[] join(int[] array1, int[] array2) {

        int[] array = new int[array1.length + array2.length];

        if (array1.length > 0 && array2.length > 0) {
            for (int i = 0; i < array1.length; i++) {
                array[i] = array1[i];
            }
            for (int j = 0; j < array2.length; j++) {
                array[array1.length + j] = array2[j];
            }
        } else if (array1.length > 0 && array2.length == 0) {
            for (int i = 0; i < array1.length; i++) {
                array[i] = array1[i];
            }
        } else {
            for (int i = 0; i < array2.length; i++) {
                array[i] = array2[i];
            }
        }
        return array;
    }

    public static void sort(int[] array) {

        int temp;

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
    }


}
