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


}
