package by.example.aston.lessonThree;

import java.util.List;

public class Student {

    private final List<Book> books; // обычная коллекция


    public Student(List<Book> books) {
        this.books = books;
    }

    public List<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        return "Student{" +
                "books=" + books +
                '}';
    }
}
