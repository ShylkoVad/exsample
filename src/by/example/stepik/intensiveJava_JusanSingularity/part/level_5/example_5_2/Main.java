package by.example.stepik.intensiveJava_JusanSingularity.part.level_5.example_5_2;

public class Main {

    public static void main(String[] args) {

        /**
         * Реализовать функцию isWhitespace, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет пробельный символ. Вернуть false в противоположном случае.
         */
        System.out.println(isWhitespace(' '));

        /**
         * Реализовать функцию isUpper, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет букву верхнего регистра.
         * Вернуть false в противоположном случае.
         */
        System.out.println(isUpper('A'));

        /**
         * Реализовать функцию isLower, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет букву нижнего регистра.
         * Вернуть false в противоположном случае.
         */
        System.out.println(isLower('A'));

        /**
         * Реализовать функцию isNumeric, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет цифру.
         * Вернуть false в противоположном случае.
         */
        System.out.println(isNumeric('5'));

        /**
         * Реализовать функцию isLetter, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет букву.
         * Вернуть false в противоположном случае.
         */
        System.out.println(isLetter('d'));

        /**
         * Реализовать функцию isLetterOrDigit, которая принимает символ c.
         * Функция должна вернуть true, если символ c представляет букву или цифру.
         * Вернуть false в противоположном случае.
         */
        System.out.println(isLetterOrDigit('r'));

        /**
         * Реализовать функцию strlen, которая принимает массив символов word.
         * Функция должна вернуть длину массива.
         */
        System.out.println(strlen(new char[]{'A'}));

        /**
         * Вывести буквы от a до z нижнего регистра через цикл, используя System.out.print.
         * Запрещено использовать тип String и функцию System.out.println.
         */
        printAlphabet();

        /**
         * Вывести буквы от z до a нижнего регистра через цикл, используя System.out.print.
         * Запрещено использовать тип String и функцию System.out.println.
         */
        printReverseAlphabet();

        /**
         * Реализовать функцию findChar, которая принимает массив символов str и символ c.
         * Функция должна вернуть индекс первого элемента в str, который равен символу c.
         * Если такого элемента нет, то вернуть -1.
         */
        System.out.println(findChar(new char[]{'h', 'e', 'l', 'l', 'o'}, 'e'));

    }

    public static boolean isWhitespace(char c) {
        return c == '\t' || c == 32;
    }

    public static boolean isUpper(char c) {
        return c >= 'A' && c <= 'Z';
    }

    public static boolean isLower(char c) {
        return c >= 'a' && c <= 'z';
    }

    public static boolean isNumeric(char c) {
        return c >= '0' && c <= '9';
    }

    public static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

    public static boolean isLetterOrDigit(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
    }

    public static int strlen(char[] word) {
        return word.length;
    }

    public static void printAlphabet() {
        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i);
        }
        System.out.println();
    }

    public static void printReverseAlphabet() {
        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i);
        }
    }

    public static int findChar(char[] str, char c) {

        int i;
        for (i = 0; i < str.length; i++) {
            if (c == str[i]) {
                return i;
            }
            //      System.out.println(i);
        }
        return -1;
    }

}
