package by.example.tinkoff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class ProcessT_Saurus_4 {

    static class Process {
        int id;
        List<Integer> dependencies;

        Process(int id) {
            this.id = id;
            this.dependencies = new ArrayList<>();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        if (n == 0) {
            System.out.println(0);
            return; // Если нет процессов, просто завершаем.
        }

        Process[] processes = new Process[n + 1];
        int[] indegree = new int[n + 1];
        int[] time = new int[n + 1];

        // Инициализация процессов
        for (int i = 1; i <= n; i++) {
            processes[i] = new Process(i);
            time[i] = 0; // Время завершения инициализируем нулем
        }

        // Чтение зависимостей
        for (int i = 1; i <= n; i++) {
            int a_i = scanner.nextInt();
            for (int j = 0; j < a_i; j++) {
                int depProcess = scanner.nextInt();
                processes[depProcess].dependencies.add(i);
                indegree[i]++;
            }
        }

        // Очередь для процессов, которые могут запускаться
        Queue<Integer> queue = new LinkedList<>();

        // Заполняем очередь начальными процессами
        for (int i = 1; i <= n; i++) {
            if (indegree[i] == 0) {
                queue.offer(i);
                time[i] = 1; // Первый процесс может начаться с 1-й секунды
            }
        }

        // Главный цикл для обработки процессов
        while (!queue.isEmpty()) {
            int currentProcess = queue.poll();
            for (int neighbor : processes[currentProcess].dependencies) {
                indegree[neighbor]--;
                // Обновляем время завершения зависимого процесса
                time[neighbor] = Math.max(time[neighbor], time[currentProcess] + 1);
                if (indegree[neighbor] == 0) {
                    queue.offer(neighbor);
                }
            }
        }

        // Время завершения процесса 1 — это ответ
        System.out.println(time[1]);

        scanner.close();
    }

}
