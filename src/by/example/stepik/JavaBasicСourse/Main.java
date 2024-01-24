package by.example.stepik.JavaBasicСourse;

import java.text.DecimalFormat;
import java.security.MessageDigest;

public class Main {

    public static void main(String[] args) throws Exception {


        /** 2.1. В Григорианском календаре год является високосным в двух случаях: либо он кратен 4, но при этом не кратен 100, либо кратен 400.
         Реализуйте метод, вычисляющий количество високосных лет с начала нашей эры (первого года) до заданного года включительно.
         Предполагается решение без циклов. Вам надо придумать и записать несложную формулу, использующую только арифметические операторы.
         **/
        int year = 1000;
        int number = 4;
        int result = (year / 4) - (year / 100) + (year / 400);
        System.out.println(result);

        /** 2.1. Реализуйте метод, возвращающий ответ на вопрос: правда ли, что a + b = c?
         Допустимая погрешность – 0.0001 (1E-4)
         Можно использовать класс Math и его методы. Класс Math доступен всегда, импортировать его не надо.
         **/
        System.out.println(doubleExpression(0.1, 0.2, 0.3));

        /** 2.1. Реализуйте метод flipBit, изменяющий значение одного бита заданного целого числа на противоположное.
         Данная задача актуальна, например, при работе с битовыми полями.
         Договоримся, что биты нумеруются от младшего (индекс 1) к старшему (индекс 32).
         **/
        System.out.println(flipBit(0, 1));

        /** 2.2. еализуйте метод, который возвращает букву, стоящую в таблице UNICODE после символа "\" (обратный слэш)
         на расстоянии a.
         **/
        System.out.println(charExpression(29));

        /** 2.2. Реализуйте метод, проверяющий, является ли заданное число по абсолютной величине степенью двойки.
         Решать можно разными способами:
         воспользовавшись одним удобным статическим методом из класса java.lang.Integer;
         применив пару трюков из двоичной арифметики;
         написав решение "в лоб" с циклом и условными операторами (можете вернуться к этой задаче после просмотра соответствующих уроков).
         **/
        System.out.println(isPowerOfTwo(0));
    }

    public static boolean doubleExpression(double a, double b, double c) {

        return Math.abs((a + b) - c) < 0.0001;
    }

    public static int flipBit(int value, int bitIndex) {
        return 1 << (bitIndex - 1) ^ value;
    }

    public static char charExpression(int a) {
        return (char)(int)('\\' + a);
    }

    public static int isPowerOfTwo(int value) {
        return (Math.abs(value) % 2);
    }

}
