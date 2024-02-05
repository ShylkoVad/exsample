package by.example.stepik.intensiveJava_JusanSingularity.part.level_5.example_5_4;

public class Main {
    public static void main(String[] args) {

        /**
         * Анаграмма - это слово или словосочетание, образованное путём перестановки букв, составляющих другое слово (или словосочетание).
         * Примеры анаграмм: пила и липа, пост и стоп.
         * Реализовать функцию isAnagram, которая принимает массивы символов str1 и str2.
         * Функция должна вернуть true, если строки являются анаграммами. Вернуть false в обратном случае.
         */
        System.out.println(isAnagram(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{'e', 'h', 'l', 'l', 'o'}));

        /**
         * Палиндром - это слово или фраза, которые одинаково читаются слева направо и справа налево.
         * Пример: Я иду с мечем судия или топот.
         * Реализовать функцию isPalindrome, которая принимает массив символов str1.
         * Функция должна вернуть true, если строки являются палиндромами. Вернуть false в обратном случае.
         */
        System.out.println(isPalindrome(new char[]{'m', 'a', 'l', 'a', 'y', 'a', 'l', 'a', 'm'}));
    }

    public static boolean isAnagram(char[] str1, char[] str2) {
        boolean result = false;

        for (int i = 0; i < str1.length; i++) {

            if (str1[i] == str2[i]) {
                result = true;
            } else {
                return false;
            }
        }
        return result;
    }

    public static boolean isPalindrome(char[] str1) {
        boolean result = false;
        for (int i = 0; i < str1.length / 2; i++) {
            if (str1[i] == str1[str1.length - 1 - i]) {
                result = true;
            } else {
                return false;
            }
        }

        return result;
    }

}
