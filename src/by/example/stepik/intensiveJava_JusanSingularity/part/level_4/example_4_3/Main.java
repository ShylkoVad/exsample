package by.example.stepik.intensiveJava_JusanSingularity.part.level_4.example_4_3;

public class Main {

    public static void main(String[] args) {

        /**
         * В этой задаче вам предстоит подобрать пароль с помощью брут-форса (полного перебора).
         * Есть пароль, который состоит из символов из строки allowedChars (см. Ожидаемая функция). В функцию bruteforcePass передается захешированный пароль с помощью метода hashPass.
         * Метод hashPass мы реализовали в тестере, но для локального тестирования можете воспользоваться закомментированным вариантом.
         * Реализуйте метод bruteforcePass, который вернет пароль соответстующий хеш-значению.
         */
    }

     public static String hashPass(String password) {
     int code = password.hashCode();
     String hashed = Integer.toString(code);
     return hashed;
 }

    public static String allowedChars = "0123456789";

    public static String bruteforcePass(String hashedPass) {
        // Написать решение сюда ↓

        return "99999";
    }
}
