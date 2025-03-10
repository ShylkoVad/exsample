package by.example.aston.lessonFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class FileAppend {
    public static void main(String[] args) {
        String filename = "append.txt";
        String textToAppend = "Hello, World!\n";

        try {
            // Проверяем, существует ли файл, и создаем его, если нет
            Path path = Paths.get(filename);
            if (!Files.exists(path)) {
                Files.createFile(path);
            }

            // Записываем строку в файл в режиме добавления
            Files.write(path, textToAppend.getBytes(), StandardOpenOption.APPEND);
            System.out.println("Текст добавлен в файл: " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}