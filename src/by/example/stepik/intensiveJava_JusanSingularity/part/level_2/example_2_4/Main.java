package by.example.stepik.intensiveJava_JusanSingularity.part.level_2.example_2_4;

public class Main {
    public static void main(String[] args) {

        printDigits();
        System.out.println();
        System.out.println(sqrSum(4));
        printEven(0, 4);
        System.out.println();
        System.out.println(pow(2, 6));

    }

    public static void printDigits() {
        for (int i = 0; i <= 9; i++) {
            System.out.print(i);
        }
    }

    public static int sqrSum(int n) {
        int sum = 0;
        if (n >= 0 && n <= 1860) {
            for (int i = 1; i <= n; i++) {
                sum = sum + i * i;
            }
        }
        return sum;
    }

    public static void printEven(int a, int b) {
        for (int i = a; i <= b; i++) {
            if ((i % 2) == 0) {
                System.out.print(i + " ");
            }
        }
    }

    public static int pow(int a, int b) {
        int degree = 1;
        if (b > 0) {
            for (int i = 1; i <= b; i++) {
                degree = degree * a;
            }
        }
        return degree;
    }


}
