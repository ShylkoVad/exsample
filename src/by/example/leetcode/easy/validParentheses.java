package by.example.leetcode.easy;

public class validParentheses {

    /**
     * Учитывая строку s, содержащую только символы '(', ')', '{', '}', '[' и ']', определите, является ли входная строка допустимой.
     * Входная строка действительна, если:
     * Открытые скобки должны закрываться скобками того же типа.
     * Открытые скобки должны закрываться в правильном порядке.
     * Каждой закрывающей скобке соответствует открытая скобка того же типа.
     */

    public static void main(String[] args) {
        System.out.println(isValid("))"));
    }


    public static boolean isValid(String s) {
        boolean result = true;
        System.out.println(s);
        if (s.length() % 2 != 0) {
            result = false;
        } else {
            char[] str = s.toCharArray();
            char one = s.charAt(0);

            if (one == '(' || one == '{' || one == '[') {
                for (int i = 1; i < s.length() / 2; i++) {
                    while (s.charAt(i))
                    result = true;

                }
            } else {
                result = false;
            }
        }
        return result;

    }
}
