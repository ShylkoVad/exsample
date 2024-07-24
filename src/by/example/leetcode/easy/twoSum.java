package by.example.leetcode.easy;

import java.util.Arrays;

public class twoSum {

    /**
     * Учитывая массив целых чисел nums и target, верните индексы двух чисел так, чтобы их сумма составляла target.
     * Вы можете предположить, что каждый вход будет иметь ровно одно решение, и вы не можете использовать один и тот же элемент дважды.
     * Вы можете вернуть ответ в любом порядке.
     */
    public static void main(String[] args) {
        System.out.println(Arrays.toString( twoSum(new int[]{2,7,11,15}, 9 )));
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (target - nums[i] == nums[j]) {
                     result = new int[]{i, j};
                }
            }
        }
return result;
    }
}
