package by.example.stepik.intensiveJava_JusanSingularity.part.level_5.example_5_3;

public class Main {
    public static void main(String[] args) {

        /**
         *Реализовать функцию toLowerCase, которая принимает массив символов str.
         * Функция должна перевести все буквы в нижний регистр.
         */
//        toLowerCase(new char[]{'H', 'e', 'l', 'l', 'o'});

        /**
         * Реализовать функцию toUpperCase, которая принимает массив символов str.
         * Функция должна перевести все буквы в верхний регистр.
         */
//        toUpperCase(new char[]{'H', 'e', 'l', 'l', 'o'});

        /**
         * Реализовать функцию concat, которая принимает массивы символов str1 и str2.
         * Функция должна объединить оба массива в один и вернуть получившийся.
         */
//        System.out.println(concat(new char[]{'h', 'e', 'l', 'l', 'o'}, new char[]{' ', 'w', 'o', 'r', 'l', 'd'}));

        /**
         * Реализовать функцию contains, которая принимает массивы символов str и substr.
         * Функция должна вернуть true, если substr находится в str. Вернуть false в противоположном случае.
         * Если длина substr равна нулю, то возвращать true.
         */
//        System.out.println(contains(new char[]{'s', 'a', 'l', 'e', 'm'}, new char[]{'l', 'a', 'm'}));

        /**
         * Реализовать функцию parseInt, которая принимает массив символов str.
         * Функция должна перевести строку в число int. Верните получившееся число.
         * При тестировании, будут передаваться валидные числовые строки.
         */
        System.out.println(parseInt(new char[]{'-', '1', '2', '3'}));

    }

    public static void toLowerCase(char[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toLowerCase(str[i]);
//            System.out.println(str[i]);
        }
    }

    public static void toUpperCase(char[] str) {
        for (int i = 0; i < str.length; i++) {
            str[i] = Character.toUpperCase(str[i]);
//            System.out.println(str[i]);
        }
    }

    public static char[] concat(char[] str1, char[] str2) {
        char[] result = new char[str1.length + str2.length];
        int i = 0, j = 0, z = 0;
        while (i < str1.length) {
            result[z++] = str1[i++];
        }
        while (j < str2.length) {
            result[z++] = str2[j++];
        }
        return result;
    }

    public static boolean contains(char[] str, char[] substr) {

        boolean result = true;
        int c = 0;
        if (substr.length == 0) {
        } else if (substr.length > str.length) {
            result = false;
        } else {
            for (char value : substr) {
                if (result) {
                    for (int j = c; j < str.length; j++) {
                        if (value == str[j]) {
                            result = true;
                            c = j + 1;
                            break;
                        } else {
                            result = false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return result;
    }

    public static int parseInt(char[] str) {

        String temp = "";
        for (int i = 0; i < str.length; i++) {
            char c = str[i];
        }
        int result = Integer.parseInt(temp);
        return result;
    }


}
