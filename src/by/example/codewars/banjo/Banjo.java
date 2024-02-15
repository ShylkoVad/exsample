package by.example.codewars.banjo;

public class Banjo {

    /**
     * Создайте функцию, которая отвечает на вопрос «Вы играете на банджо?».
     * Если ваше имя начинается с буквы «R» или строчной «r», вы играете на банджо!
     * Функция принимает имя в качестве единственного аргумента и возвращает одну из следующих строк:
     * name + " plays banjo"
     * name + " does not play banjo"
     */

    public static void main(String[] args) {
        System.out.println(areYouPlayingBanjo("Vadzim"));
    }

    public static String areYouPlayingBanjo(String name) {
        char[] temp = name.toCharArray();
        if (temp[0] == 'R' || temp[0] == 'r') {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
}
