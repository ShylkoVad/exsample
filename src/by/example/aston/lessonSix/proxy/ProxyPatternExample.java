package by.example.aston.lessonSix.proxy;

public class ProxyPatternExample {

    public static void main(String[] args) {
        Image image = new ProxyImage("test_image.jpg");
        image.display();  // Загружается и отображается
        image.display();  // Только отображается
    }
}
