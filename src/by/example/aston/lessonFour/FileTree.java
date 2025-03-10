package by.example.aston.lessonFour;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileTree {
    public static void main(String[] args) {
        Path path = Paths.get("C:/Lantek"); //Путь к папке

        try {
            Files.walk(path)
                    .filter(Files::isRegularFile)
                    .forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}