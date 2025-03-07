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

        // Использование стрима для вывода студентов
        students.stream()
                .peek(student -> System.out.println("Студент: " + student)) // Вывод информации о каждом студенте
                .flatMap(student -> student.getBooks().stream())
                .sorted(Comparator.comparingInt(Book::getPages)) // Сортировка по количеству страниц
                .distinct() // Уникальные книги
                .filter(book -> book.getYear() > 2000) // Книги после 2000 года
                .limit(3) // Ограничение на 3 элемента
                .map(Book::getYear) // Получение годов выпуска
                .findFirst() // Получение первого года выпуска
                .ifPresentOrElse(
                        year -> System.out.println("Год выпуска найденной книги: " + year),
                        () -> System.out.println("Книга отсутствует") // Сообщение об отсутствии
                );
    }
}
