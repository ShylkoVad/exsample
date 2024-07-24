package by.example.tinkoff;

import java.util.Scanner;

public class InterestingPairs_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Читаем размер матрицы n
        int n = scanner.nextInt();
        int[][] matrix = new int[n][n];

        // Читаем саму матрицу
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Массивы для хранения сумм строк и столбцов
        long[] rowSums = new long[n];
        long[] colSums = new long[n];

        // Вычисляем суммы строк и столбцов
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                rowSums[i] += matrix[i][j];
                colSums[j] += matrix[i][j];
            }
        }

        // Подсчитываем количество интересных пар
        int interestingPairsCount = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                // Проверяем условие интересности
                if (Math.abs(rowSums[i] - colSums[j]) <= matrix[i][j]) {
                    interestingPairsCount++;
                }
            }
        }

        // Выводим результат
        System.out.println(interestingPairsCount);
    }
}
