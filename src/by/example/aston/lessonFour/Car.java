package by.example.aston.lessonFour;

import java.io.Externalizable;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Car implements Externalizable {
    private String model;
    private int year;

    public Car() {
    }

    public Car(String model, int year) {
        this.model = model;
        this.year = year;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(model);
        out.writeInt(year);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        model = in.readUTF();
        year = in.readInt();
    }

    @Override
    public String toString() {
        return "Car{model='" + model + "', year=" + year + "}";
    }

    public static void main(String[] args) {
        Car car = new Car("Toyota", 2020);
        String filename = "car.ser";

        // Сериализация
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            car.writeExternal(oos);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Десериализация
        Car deserializedCar = new Car();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            deserializedCar.readExternal(ois);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println(deserializedCar);
    }
}