package lesson1.BetterCode.v4;

public class Main {
    public static void main(String[] args) {
        Product p = Product.getBuilder()
                                        .setName("Iphone")
                                        .setDesc("This is a brand new iphone")
                                        .setPrice(100000)
                                        .build();
    }
}
