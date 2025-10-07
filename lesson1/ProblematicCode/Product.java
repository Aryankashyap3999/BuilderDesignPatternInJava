package lesson1.ProblematicCode;

import java.util.List;

public class Product {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Product(String name, String desc, int price, String brand, String category, int discount, String createdAt, String updatedAt, List<String> images) {
        this.name = name;
        this.desc = desc;
        this.brand = brand;
        this.category = category;
        this.discount = discount;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.images = images;
    }

    // solve problem or forcefully passing args can be solved by constructor overloading

    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

    // But it create another problem and that is constructor explosion
    // What is constructor explosion let's suppose you have 4 args than total number of fesible and different set of constructor is 2^4 that is a poor way of coding
    // And when you need more args than again you have to make different sets of constructors.
    // It is not a solution.

}
