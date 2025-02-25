package by.example.aston.lessonOne;

public class User {

    //Приветные переменные
    private String name;
    private int age;
    private String email;

    // Константа
    public static final String RACE = "Caucasoid race";

    // Конструктор без параметров
    public User() {
    }

    // Конструктор со всеми параметрами
    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    // Геттер и сеттер для name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Геттер и сеттер для age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Возраст не может быть отрицательным");
        }
    }

    // Геттер и сеттер для email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
