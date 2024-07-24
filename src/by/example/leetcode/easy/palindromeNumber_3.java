package by.example.leetcode.easy;

public class palindromeNumber_3 {
    /**
     * Учитывая целое число x, верните true если x палиндром, и false иначе.
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome(100001));
    }

    public static boolean isPalindrome(int x) {
        String s = String.valueOf(x); // Преобразовать в строку

        for (int i = 0; i < s.length() / 2; i++) {
            // Проверяем, находятся ли элементы на одинаковом расстоянии от
            // начало и конец одинаковы, в противном случае мы возвращаем false
            if (s.charAt(i) != s.charAt(s.length() - i - 1))
                return false;
        }

        // если ошибок не обнаружено, мы возвращаем true
        return true;
    }
}
