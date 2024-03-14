package by.example.leetcode.easy;

public class palindromeNumber {
    /**
     * Учитывая целое число x, верните true если x палиндром, и false иначе.
     */

    public static void main(String[] args) {
        System.out.println(isPalindrome(1000021));
    }

    public static boolean isPalindrome(int x) {
        boolean result = true;
        if (x < 0) {
            result = false;
        } else {
            String numberString = Integer.toString(x);
            char[] charArray = numberString.toCharArray();

            int[] intArray = new int[charArray.length];
            for (int i = 0; i < charArray.length; i++) {
                intArray[i] = Character.getNumericValue(charArray[i]);
            }
            for (int j = 0, i = intArray.length - 1; j < intArray.length / 2; j++, i--) {
                if (intArray[j] == intArray[i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
