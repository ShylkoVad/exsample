package by.example.tinkoff.training;

import java.util.Scanner;

public class Roll {

    /**
     * По возвращению с кофе-брейка Ваня задумался — а можно ли было обойтись меньшим числом движений,
     * будь нож Вани бесконечно длинным (иначе говоря, если он мог бы сделать сколько угодно разрезов за раз,
     * если эти разрезы лежат на одной прямой)? Считается, что места для разрезов намечены заранее, и все разрезы
     * делаются с ювелирной точностью.
     * <p>
     * Оказывается, что можно. Например, если Ваня хотел бы разделить рулет на N части, он мог бы обойтись
     * двумя разрезами — сначала он разделил бы рулет на две половинки, а потом совместил бы две половинки
     * и разрезал обе пополам одновременно.
     * <p>
     * Вам дано число N, требуется сказать, каким минимальным числом разрезов можно обойтись.
     */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt(); // количество людей на кофе-брйке

        int numberCuts = 0;

        int number = 1;

        while (number < N) {
            numberCuts ++;
            number = number * 2;
        }
        System.out.println(numberCuts);
    }
}
