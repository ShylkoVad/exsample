package by.example.aston.lessonSix.decorator;

public class SimpleCoffee implements Coffee{

    @Override
    public String getDescription() {
        return "Simple coffee";
    }

    @Override
    public double cost() {
        return 1.00;
    }
}
