package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_3.example_3_2;

import java.lang.reflect.Array;
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
        System.out.println(Arrays.toString(range(5)));

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
        // Написать решение сюда ↓
        return range;
    }

}
