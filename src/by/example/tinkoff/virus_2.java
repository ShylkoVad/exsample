package by.example.tinkoff;

import java.util.Scanner;

public class virus_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();

        if (n == 1) {
            System.out.println(1); // Хетаг
            return;
        }

        // После 1-й минуты
        int infectedCount = 4;
        for (int i = 2; i <= n; i++) {
            infectedCount += 4 * (i - 1);
        }

        // Учитываем Хетага
        System.out.println(infectedCount + 1);
    }
}
