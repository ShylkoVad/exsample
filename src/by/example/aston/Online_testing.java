package by.example.aston;

public class Online_testing {

    public static void main(String[] args) {
//        test_4();
        test_6();
    }

    public static void test_4() {
        String test = "Hello";
        String test2 = "Hello";
        System.out.println(test == test2);
    }

    public static void test_6() {
        for (int i = 10; i < 20; i +=2) {
            if (i > 15)
                break;
            if (i % 4 == 0)
                continue;
            System.out.println(i);
        }
    }

}
