package by.example.yandex.algorithms5_0.lecture1;

import java.util.Scanner;

public class footballCommentator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int G1_1 = sc.nextInt(); // число мячей забитых первой командой в 1 матче
        System.out.print(":");
        int G2_1 = sc.nextInt(); // число мячей забитых второй командой в 1 матче
//        System.out.println();
        int G1_2 = sc.nextInt(); // число мячей забитых первой командой во 2 матче
        System.out.print(":");
        int G2_2 = sc.nextInt(); // число мячей забитых второй командой во 2 матче
//        System.out.println();
        int format = sc.nextInt(); // формат игры первой команды 1 - "дома"; 2 - "в гостях"

        int G1 = 0; //количество голов, которые необходимо забить первой команде, чтобы победить
        int difference_1 = G1_1 - G2_1;
        int difference_2 = G1_2 - G2_2;

        if (format == 1) {
            if (difference_1 == 0 || difference_2 == 0) {
                G1 = 1;
            }
        } else if (difference_1 == 2 || difference_2 == 0) {
            G1 = 1;
        }

        System.out.println(G1);
    }
}
