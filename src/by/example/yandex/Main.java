package by.example.yandex;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String expected = scanner.nextLine();

        String input = scanner.nextLine();

        String result = processInput(expected, input);
        if (result.equals(expected)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static String processInput(String expected, String input) {
        StringBuilder typedString = new StringBuilder();
        int cursorPosition = 0;

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '<' && i < input.length() - 1) {
                String action = input.substring(i + 1, input.indexOf('>', i));
                if (action.equals("delete") && cursorPosition < typedString.length()) {
                    typedString.deleteCharAt(cursorPosition);
                } else if (action.equals("bspace") && cursorPosition > 0) {
                    cursorPosition--;
                    typedString.deleteCharAt(cursorPosition);
                } else if (action.equals("left") && cursorPosition > 0) {
                    cursorPosition--;
                } else if (action.equals("right") && cursorPosition < typedString.length()) {
                    cursorPosition++;
                }
                i = input.indexOf('>', i);
            } else {
                char c = input.charAt(i);
                if (Character.isLetter(c)) {
                    typedString.insert(cursorPosition, c);
                    cursorPosition++;
                }
            }
        }

        return typedString.toString();
    }
}


//  hellochild
//  helto<left><bspace>l<delete>ochilds<bspace>