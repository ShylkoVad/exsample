package by.example.yandex.algorithms5_0.lecture1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class paintingTrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int P = sc.nextInt(); // ведро для Васи установлено возле дерева P
        int V = sc.nextInt(); // на сколько деревьев Вася может удалиться
        int Q = sc.nextInt(); // ведро для Маши установлено возле дерева Q
        int M = sc.nextInt(); // на сколько деревьев Маша может удалиться

        List<Integer> pv = new ArrayList<>();

        for (int i = 0, j = 0; i < (V * 2 + 1); i++) {
            pv.add(P + V - (j++));
        }

        for (int i = 0, j = 0; i < (M * 2 + 1); i++) {
            pv.add(Q + M - (j++));

        }
        for (int i = 0; i < pv.size(); i++) {
            for (int j = i + 1; j < pv.size(); j++) {
                if (pv.get(i).equals(pv.get(j))) {
                    pv.remove(j);
                }
            }
        }
        System.out.println(pv.size());
    }
}
