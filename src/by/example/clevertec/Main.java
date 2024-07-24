package by.example.clevertec;

public class Main {
    public static void main(String[] args) {
        String discountCardInfo = "true";
int quantity = 6;
int discount;

        if (quantity >= 5 ) {
            discount = 10;
        } else if (discountCardInfo == null) {
            discount = 2;
        } else {
            discount = 3;
        }
        System.out.println(discount);
    }
}
