package by.example.tinkoff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ProcessT_Saurus_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] indegree = new int[n + 1];
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            adjList.add(new ArrayList<>());
        }

        // Считывание зависимостей
        for (int i = 1; i <= n; i++) {
            int a_i = scanner.nextInt();
            for (int j = 0; j < a_i; j++) {
                int depProcess = scanner.nextInt();
                adjList.get(depProcess).add(i);
                indegree[i]++;
            }
        }

        // Уровни процессов
        List<List<Integer>> levels = new ArrayList<>();
        for (int i = 0; i <= n; i++) {
            levels.add(new ArrayList<>());
        }

        Queue<Integer> queue = new LinkedList<>();

        // Заполняем очередь процессами с нулевой степенью входа
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                levels.get(0).add(i); // Начальный уровень
            }
        }

        int currentLevel = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> currentProcesses = new ArrayList<>();

            while (size-- > 0) {
                int currentProcess = queue.poll();
                currentProcesses.add(currentProcess);

                // Обработка всех соседей (зависимых процессов)
                for (int neighbor : adjList.get(currentProcess)) {
                    indegree[neighbor]--;
                    if (indegree[neighbor] == 0) {
                        queue.offer(neighbor);
                        levels.get(currentLevel + 1).add(neighbor); // Переход на следующий уровень
                    }
                }
            }
            // Увеличиваем уровень только если есть добавленные процессы
            if (!currentProcesses.isEmpty()) {
                currentLevel++;
                // Сортируем процессы текущего уровня
                Collections.sort(currentProcesses);
                levels.set(currentLevel, currentProcesses);
            }
        }

        // Вывод результата
        System.out.println(currentLevel);
        for (int i = 1; i <= currentLevel; i++) {
            List<Integer> levelProcesses = levels.get(i);
            System.out.print(levelProcesses.size() + " ");
            for (int process : levelProcesses) {
                System.out.print(process + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
