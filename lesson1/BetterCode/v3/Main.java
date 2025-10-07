package lesson1.BetterCode.v3;

public class Main {
    public static void main(String[] args) {
        Builder b = new Builder();

        b.setName("Iphone");
        b.setDesc("This is a brand new iphone");
        b.setPrice(100000);
        // similarily others

        Product p = new Product(b);
        // This is Builder design pattern
    }
}
