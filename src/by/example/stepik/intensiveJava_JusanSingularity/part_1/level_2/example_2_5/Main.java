package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_2.example_2_5;

public class Main {
    public static void main(String[] args) {

        System.out.println(sum1n(51261));
        System.out.println(countLeapYear(100));
    }

    public static int sum1n(int a) {
        int sum = 0;
        if (a >= 1 && a <= 65535) {
            if (a % 2 == 0) {
                sum = a / 2 * (a + 1);
            } else {
                sum = (a + 1) / 2 * a;
            }
        }
        return sum;
    }

    public static int countLeapYear(int n) {
        int year = 0;
        if (n > 0) {
            year = (n / 4) - (n / 100) + (n / 400);
        }

        return year;
    }


}
