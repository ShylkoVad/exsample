package by.example.aston.lessonSix.builder;

public class BuilderPatternExample {

    public static void main(String[] args) {
        Pizza pizza = new Pizza.PizzaBuilder()
                .setDough("Thin crust")
                .setSauce("Tomato")
                .setTopping("Cheese")
                .build();
        System.out.println(pizza);
    }
}
