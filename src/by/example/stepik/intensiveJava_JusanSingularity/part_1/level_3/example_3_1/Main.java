package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_3.example_3_1;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ingredientAt(new String[]{"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"}, 10);

        System.out.println(Arrays.toString(
                ingredientEdit(new String[]{"Рис", "Баранина", "Лук", "Масло", "Чеснок", "Морковь", "Красный перец", "Зира", "Соль"}, 0, "Укроп")));
    }


    public static void ingredientAt(String[] s, int i) {
        if (s.length >= 0 && s.length <= 10000 && i >= 0 && i <= s.length - 1) {
            System.out.println(s[i]);
        } else
            System.out.println(" ");
    }

    public static String[] ingredientEdit(String[] s, int i, String v) {



        if (s.length >= 0 && s.length <= 10000 && i >= 0 && i < s.length) {

            s[i] = v;
        }
        return s;
    }

}


