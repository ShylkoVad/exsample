package by.example.part_1.level_2.example_2_3;

public class Main {
    public static void main(String[] args) {

        System.out.println(maxOfTwo(42, 1));
        System.out.println(intCmp(1, 5));
        System.out.println(maxOfThree(42,1, 0));
    }

    public static int maxOfTwo(int a, int b) {
        if (a > b) {
            return a;
        } else return b;
    }

    public static int intCmp(int a, int b) {

        if (a > b) {
           return 1;
            }
        if (a == b) {
            return 0;
        }
        return -1;
    }

    public static int maxOfThree(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else return c;
    }


}
