package by.example.tinkoff;

import java.util.Scanner;

public class SumFrom100ToN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Чтение входного значения n
        int n = scanner.nextInt();

        // Сумма от 1 до n
        long sumN = (long) n * (n + 1) / 2;

        // Сумма от 1 до 99 - это 4950
        long sum99 = 4950;

        // Сумма от 100 до n
        long result = sumN - sum99;

        // Вывод результата
        System.out.println(result);

        // Закрытие сканера
        scanner.close();
    }
}
