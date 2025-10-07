package lesson1.BetterCode.v3;

import java.util.List;

public class Builder {
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

    public void setName (String name) {
        this.name = name;
    }

    public void setDesc (String desc) {
        this.desc = desc;
    }

    public void setPrice (int price) {
        this.price = price;
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

