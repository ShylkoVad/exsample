package by.example.stepik.intensiveJava_JusanSingularity.part.level_8.example_8_2;

import java.util.HashMap;
import java.util.Set;

public class Main {

    public static void main(String[] args) {

        /**
         * Реализуйте функцию get, которая будет возвращать значение по ключу.
         * Предпологается, что map всегда содержит ключ key.
         */
        System.out.println(get(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }}, "2"));

        /**
         * Реализуйте функцию set, которая будет устанавливать значение value по ключу key.
         */
        set(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }}, "2", "three");

        /**
         * Реализовать функцию checkKey, которая возвращает true, если указанный ключ присутствует в map.
         * Вернуть false в противном случае.
         */
        System.out.println(checkKey(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }}, "2"));

        /**
         * Реализовать функцию checkValue, которая возвращает true,
         * если value содержится в качестве значения в map. Вернуть false в противном случае.
         */
        System.out.println(checkValue(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }}, "two"));

        /**
         * Реализуйте функцию printKeys, которая выводит в консоль через новую линию все ключи из map.
         */
        printKeys(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }});

        /**
         * Реализуйте функцию printValues, которая выводит в консоль через новую линию все значения из map.
         */
        printValues(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }});

        /**
         * Реализовать функцию copy, которая возвращает полную копию переданного map.
         */
        copy(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }});

        /**
         * Реализуйте функцию removeKeys, которая удаляет ключи keys в map.
         */
        removeKeys(new HashMap<>() {{
            put("1", "first");
            put("2", "two");
        }}, new String[]{"1"});

        /**
         * Реализуйте функцию findDuplicates, которая возвращает дублирующие элементы из переданного массива.
         * Вернуть пустой массив, если нет дубликатов.
         */

    }

    public static String get(HashMap<String, String> map, String key) {
        return map.get(key);
    }

    public static void set(HashMap<String, String> map, String key, String value) {
        map.put(key, value);
    }

    public static boolean checkKey(HashMap<String, String> map, String key) {
        return map.containsKey(key);
    }

    public static boolean checkValue(HashMap<String, String> map, String value) {
        return map.containsValue(value);
    }

    public static void printKeys(HashMap<String, String> map) {
//        Set<String> keys = map.keySet(); // первый способ
//        System.out.print(keys);
        for (String keys : map.keySet()) { // второй способ
            System.out.println(keys);
        }
    }

    public static void printValues(HashMap<String, String> map) {
        for (String values : map.values()) {
            System.out.println(values);
        }
    }

    public static HashMap<String, String> copy(HashMap<String, String> map) {
//        HashMap<String, String> mapNew = new HashMap<String, String>(map);  // первый метод
//        return mapNew;
        return new HashMap<>(map); // второй метод
    }

    public static void removeKeys(HashMap<String, String> map, String[] keys) {
        for (int i = 0; i < keys.length; i++) {
            map.remove(keys[i]);
        }
//        System.out.println(map);
    }

    public static int[] findDuplicates(int[] array) {
        // Написать решение сюда ↓

        return null;
    }


}
