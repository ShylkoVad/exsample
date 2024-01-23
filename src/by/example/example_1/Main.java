package by.example.example_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        Класс Scanner имеет еще ряд методов, которые позволяют получить введенные пользователем значения:
//
//        next(): считывает введенную строку до первого пробела
//        nextLine(): считывает всю введенную строку
//        nextInt(): считывает введенное число int
//        nextDouble(): считывает введенное число double
//        nextBoolean(): считывает значение boolean
//        nextByte(): считывает введенное число byte
//        nextFloat(): считывает введенное число float
//        nextShort(): считывает введенное число short

        Scanner input = new Scanner(System.in);



        System.out.print("Введите число: ");
        int number = input.nextInt();

        System.out.print("Введите число: ");
        int number1 = input.nextInt();

        int summa = number + number1;

        System.out.print("Введите имя: ");
        String str = input.next();

        System.out.println(str + " получил сумму чисел " + summa);



    }
}
