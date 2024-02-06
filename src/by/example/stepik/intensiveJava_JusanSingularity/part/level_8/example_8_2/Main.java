package by.example.stepik.intensiveJava_JusanSingularity.part.level_8.example_8_2;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        /**
         * Реализуйте функцию get, которая будет возвращать значение по ключу.
         * Предпологается, что map всегда содержит ключ key.
         */
        System.out.println(get(new HashMap<>(), "f"));

        /**
         * Реализуйте функцию set, которая будет устанавливать значение value по ключу key.
         */
    }

    public static String get(HashMap<String, String> map, String key) {

        return map.get(key);
    }

    public static void set(HashMap<String, String> map, String key, String value) {

//        map = map.replace(key, value);

    }
}
