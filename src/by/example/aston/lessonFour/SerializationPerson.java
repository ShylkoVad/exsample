package by.example.aston.lessonFour;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationPerson {
    public static void serialize(Person person, String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(person);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Person deserialize(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            return (Person) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static void main(String[] args) {
        Person person = new Person("Вадим", 40);
        String filename = "person.ser";

        serialize(person, filename);  // Сериализация

        Person deserializedPerson = deserialize(filename);  // Десериализация
        System.out.println(deserializedPerson);
    }
}
