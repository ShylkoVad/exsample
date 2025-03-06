package by.example.aston.lessonThree;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Создание иммутабельного списка студентов с книгами
        List<Student> students = List.of(
                new Student(List.of(
                        new Book("Book 1", 300, 1999),
                        new Book("Book 2", 150, 2001),
                        new Book("Book 3", 200, 2020),
                        new Book("Book 4", 250, 2005),
                        new Book("Book 5", 320, 2010))),
                new Student(List.of(
                        new Book("Book 6", 400, 1995),
                        new Book("Book 7", 180, 2003),
                        new Book("Book 8", 220, 2002),
                        new Book("Book 9", 350, 2021),
                        new Book("Book 10", 500, 1990)))
        );

        students.forEach(System.out::println); // 3.1 - Вывод студентов

        students.stream()  // 3.2 - Получение списка книг для каждого студента с использованием одного стрима
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages)) // 3.4 - Сортировка по количеству страниц
                .distinct() // 3.5 - Уникальные книги
                .filter(book -> book.getYear() > 2000) // 3.6 - Книги после 2000 года
                .limit(3) // 3.7 - Ограничение на 3 элемента
                .map(Book::getYear) // 3.8 - Получение годов выпуска
                .findFirst() // 3.9 - Получение первого года выпуска
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует") // 3.10 - Сообщение об отсутствии
                );
    }
}
