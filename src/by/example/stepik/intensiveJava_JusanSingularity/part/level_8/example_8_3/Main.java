package by.example.stepik.intensiveJava_JusanSingularity.part.level_8.example_8_3;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /**
         * В этом задании вам нужно реализовать функционал поиска по телефонным контактам.
         * Реализуйте функцию searchPhonebook, которая возвращает контакты, совпадающие по имени.
         * Контакты представляют HashMap, где ключ - это имя, а значение - это номер телефона.
         */
        System.out.println(searchPhonebook(new HashMap<>() {{
            put("Антон", "+7(727)293-70-58");
            put("Одногруппник Магжан", "+7(727)355-41-26");
            put("Апашка", "+7(727)224-21-11");
            put("Сантехник Антон", "+7(727)292-90-94");
        }}, "Антон"));

    }

    public static HashMap<String, String> searchPhonebook(HashMap<String, String> phonebook, String value) {
        for (int i = 0; i < phonebook.size(); i++) {

        }

        return null;
    }
}
