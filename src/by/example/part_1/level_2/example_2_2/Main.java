package by.example.part_1.level_2.example_2_2;

public class Main {

    public static void main(String[] args) {

        prevNext(20);
        divAndMod(5, 2);
        currencyExchange(1, 430);
        lastDigit(78);
        tenDigit(7897);
    }

    public static void prevNext(int a) {
        if (-2147483648 < a && a < 2147483647) {
            System.out.println((a - 1) + " -> " + a + " -> " + (a + 1));
        }
    }

    public static void divAndMod(int a, int b) {

        if (a > 0 && a < 10000 && b > 0 && b < 10000) {
            System.out.println(a / b + " " + a % b);
        }
    }

    public static void currencyExchange(int a, int b) {
        System.out.println(a * b);
    }

    public static void lastDigit(int a) {
        if (a > 0) {
            System.out.println(a % 10);
        }
    }

    public static void tenDigit(int a)  {
        if (a > 9) {
            System.out.println((a/10) % 10);
        }
    }


}
