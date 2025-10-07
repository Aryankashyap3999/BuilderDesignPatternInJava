package lesson1.BetterCode.v1;

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

   // Instead of using constructor why not use setter to set the value like

    public void setName (String name) {
        this.name =  name;
    }

    public void setDesc (String desc) {
        this.desc = desc;
    }

    public void setPrice (int price)  {
        this.price = price;
    }
    // similarly for others args too.

}

