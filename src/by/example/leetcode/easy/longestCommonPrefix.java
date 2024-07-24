package by.example.leetcode.easy;

import java.util.Arrays;

public class longestCommonPrefix {

    /**
     * Напишите функцию для поиска самой длинной строки общего префикса среди массива строк.
     * Если общего префикса нет, верните пустую строку «».
     */

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight", "flot"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        System.out.println(Arrays.toString(strs));
        Arrays.sort(strs);
        System.out.println(Arrays.toString(strs));
        String left = strs[0];
        String right = strs[strs.length - 1];
        System.out.println(left);
        System.out.println(right);
        int index = 0;
        int minLengthString = Math.min(left.length(), right.length());
        while (index < minLengthString) {
            if (left.charAt(index) == right.charAt(index)) {
                index++;
            } else {
                break;
            }
        }
        return left.substring(0, index);
    }
}
