package by.example.codewars.numberUtils;

public class NumberUtils {

    /**
     * Нарциссическое число (или число Армстронга) — это положительное число,
     * которое представляет собой сумму своих цифр,
     * каждая из которых возведена в степень количества цифр в данном основании.
     * В этой Ката мы ограничимся десятичной системой счисления (основание 10).
     * Ваш код должен возвращать истину или ложь (а не «истину» и «ложь») в зависимости от того,
     * является ли данное число нарциссическим числом по основанию 10.
     */

    public static void main(String[] args) {
        System.out.println(isNarcissistic(1634));
    }

    public static boolean isNarcissistic(int number) {

        double result = 0;
        String numberString = Integer.toString(number); // преобразуем число в строку
        int degree = numberString.length();
        int[] newGuess = new int[numberString.length()]; // создаем массив
        for (int i = 0; i < numberString.length(); i++)
        {
            newGuess[i] = numberString.charAt(i) - '0';

            result = result + Math.pow(newGuess[i], degree);
        }

        return result == number;
    }

}
