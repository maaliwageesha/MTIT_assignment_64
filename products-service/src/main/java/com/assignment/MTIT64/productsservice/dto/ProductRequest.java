package com.assignment.MTIT64.productsservice.dto;

public class ProductRequest {

    private String name,category,qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getQty() {
        return qty;
    }

    public void setQty(String qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "ProductRequest{" +
                "name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", qty='" + qty + '\'' +
                '}';
    }
}
