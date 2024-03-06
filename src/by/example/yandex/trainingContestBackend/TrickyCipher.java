package by.example.yandex.trainingContestBackend;

import java.util.Scanner;

/**
 * Volozh,Arcady,Yurievich,11,2,1964
 * Segalovich,Ilya,Valentinovich,13,9,1964
 * <p>
 * Известная компания Тындекс в очередной раз проводит набор стажёров.
 * Заботясь о персональных данных соискателей, компания придумала хитрый алгоритм шифрования:
 * Подсчитывается количество различных символов в ФИО (регистр важен, А и а — разные символы).
 * Берётся сумма цифр в дне и месяце рождения, умноженная на 64.
 * Для первой (по позиции в слове) буквы фамилии определяется её номер в алфавите (в 1 -индексации), умноженный на
 * 256 (регистр буквы не важен).
 * Полученные числа суммируются.
 * Результат переводится в 16-чную систему счисления (в верхнем регистре).
 * У результата сохраняются только 3 младших разряда (если значимых разрядов меньше, то шифр дополняется до
 * 3 -х разрядов ведущими нулями).
 * Ваша задача — помочь вычислить для каждого кандидата его шифр.
 */
public class TrickyCipher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите количество кандидатов: ");
        int candidatesCount = scanner.nextInt();
        scanner.nextLine(); // съедаем перевод строки

        for (int i = 0; i < candidatesCount; i++) {
            System.out.print("Введите данные кандидата " + (i + 1) + " (ФИО, дд, мм, гггг): ");
            String input = scanner.nextLine();
            String[] parts = input.split(",");

            String fullName = parts[0] + parts[1] + parts[2];
            int day = Integer.parseInt(parts[3]);
            int month = Integer.parseInt(parts[4]);
            int year = Integer.parseInt(parts[5]);

            String cipher = calculateCipher(fullName, day, month, year);
            System.out.println("Шифр для кандидата " + (i + 1) + ": " + cipher);
        }
    }

    public static String calculateCipher(String fullName, int day, int month, int year) {
        int uniqueChars = (int) fullName.chars().distinct().count();

        int day_1 = day / 10;
        int day_2 = day % 10;
        int month_1 = month / 10;
        int month_2 = month % 10;
        int sum = (day_1 + day_2 + month_1 + month_2) * 64;

        int firstLetter = Character.toUpperCase(fullName.charAt(0)) - 'A' + 1;
        int firstLetterMultiply = firstLetter * 256;

        int result = uniqueChars + sum + firstLetterMultiply;
        String hexResult = Integer.toHexString(result).toUpperCase();
        String lastThreeChars;
        if (hexResult.length() >= 3) {
            lastThreeChars = hexResult.substring(hexResult.length() - 3);
        } else
            lastThreeChars = "0" + hexResult;

        return lastThreeChars;
    }
}