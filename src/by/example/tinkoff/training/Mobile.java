package by.example.tinkoff.training;

import java.util.Scanner;

public class Mobile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt(); // абонентская плата Кости составляет A рублей
        int B = sc.nextInt(); // за эту стоимость Костя получает B мегабайт интернет-трафика
        int C = sc.nextInt(); // если Костя выйдет за лимит трафика, то каждый следующий мегабайт будет стоить ему C рублей
        int D = sc.nextInt(); // Костя планирует потратить D мегабайт интернет-трафика в следующий месяц

        int RUB = 0; // Помогите ему сосчитать, во сколько рублей ему обойдется интернет.

        // Ввод 100 10 12 15    ; 100 10 12 1
        // Вывод 160            ; 100

        if (D - B <= 0 ) {
            RUB = A;
        } else {
            RUB = A + (D - B) * C;
        }

        System.out.println(RUB);
    }
}
