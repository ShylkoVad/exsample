package by.example.leetcode.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class romanInteger {
    /**
     * Римские цифры представлены семью различными символами: I, V, X, L, C и M
     * Symbol       Value
     * I             1
     * V             5
     * X             10
     * L             50
     * C             100
     * D             500
     * M             1000
     * Например, 2 пишется как II римская цифра, просто складывая две единицы. 12 пишется как  XII,
     * что просто X + II. Число 27 записывается как XXVII, то есть XX + V + II.
     * Римские цифры обычно пишутся от большей к меньшей слева направо.
     * Однако цифра «четыре» не является цифрой «четыре» IIII. Вместо этого число четыре записывается как IV.
     * Поскольку единица стоит перед пятеркой, мы вычитаем ее, получая четыре.
     * Тот же принцип применим и к числу девять, которое записывается как IX.
     * Есть шесть случаев, когда используется вычитание:
     * I можно поставить перед V(5) и X(10), чтобы получилось 4 и 9.
     * X можно поставить перед L(50) и C(100), чтобы получилось 40 и 90.
     * C можно поставить перед D(500) и M(1000), чтобы получить 400 и 900.
     * Дана римская цифра, преобразуйте ее в целое число.
     */

    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }

    public static int romanToInt(String s) {
        if (s == null || s.length() == 0) {
            return 0;
        }
        Map<Character, Integer> romanMap = new HashMap<>();
        romanMap.put('I', 1);
        romanMap.put('V', 5);
        romanMap.put('X', 10);
        romanMap.put('L', 50);
        romanMap.put('C', 100);
        romanMap.put('D', 500);
        romanMap.put('M', 1000);

        int result = 0;
        int previousValue = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanMap.get(s.charAt(i));
            if (currentValue < previousValue) {
                result -= currentValue;
            } else {
                result += currentValue;
            }
            previousValue = currentValue;
        }
        return result;
    }

}
