package com.company.product;

public class Product {
    private long id;

    private String productName;
    private int quantity;
    private double price;
    public static String description;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static String getDescription() {
        return description;
    }

    public static void setDescription(String description) {
        Product.description = description;
    }
}
