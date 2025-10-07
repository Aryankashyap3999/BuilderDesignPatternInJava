package lesson1.BetterCode.v4;

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

    private Product(Builder b) {  // 1st step to make it private such anyone can't access it
        if(b.getPrice() > 0) {
            this.price = b.getPrice();
        }
        this.name = b.getName();
        // all other properties.
    }


    public static Builder getBuilder() {  // 2nd step we expose a getBuilder method that can directly be called from product class
        return new Builder();
    }

    public static class Builder {
    private String name;
    private String desc;
    private int price;
    private String brand;
    private String category;
    private int discount;
    private String createdAt;
    private String updatedAt;
    private List<String> images;

    Builder () {

    }

    public Product build () {  // step 3 make a new build method that call a new product
        return new Product(this);
    }

    public Builder setName (String name) {
        this.name = name;
        return this;
    }

    public Builder setDesc (String desc) {
        this.desc = desc;
        return this;
    }

    public Builder setPrice (int price) {
        this.price = price;
        return this;
    }

    // similarly for others

    public String getName () {
        return this.name;
    }

    public String getDesc () {
        return this.desc;
    }

    public int getPrice () {
        return this.price;
    }

    // similarily for others

    
}


}
