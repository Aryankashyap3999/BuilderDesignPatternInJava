package lesson1.BetterCode.v1;

public class Main {
    public static void main(String[] args) {
        Product p = new Product();

        p.setName("Iphone");
        p.setDesc("This is a brand new iphone");
        p.setPrice(100000);
        // similarly for other args.

        // Benefits :- Code is far more readable, extensible and managable.
        // Problems :- Validations :- In this approach validations occurs after object creation but we want it should occures before object creations.
        // It can't work with immutable objects.
    }
}
