package by.example.stepik.intensiveJava_JusanSingularity.part_1.level_2.example_2_1;

public class Main {

    public static void main(String[] args) {
        System.out.println(sum(2, 56));

        System.out.println(isNegative(20));
    }

    public static int sum(int a, int b) {

        int sum = a + b;
        if (-2147483648 <= sum && sum <= 2147483647) {
            sum = sum;
        }
        return sum;
    }

    public static boolean isNegative(int a) {

        return a <= 0;
    }
}
