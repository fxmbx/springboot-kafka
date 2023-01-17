package com.funbi.springbootkafka.models;

public class Product {
    private int id;
    private String productName;
    private String productDescription;
    private double productPrice;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getProductName() {
        return productName;
    }
    public void setProductName(String productName) {
        this.productName = productName;
    }
    public String getProductDescription() {
        return productDescription;
    }
    public void setProductDescription(String productDescription) {
        this.productDescription = productDescription;
    }
    public double getProductPrice() {
        return productPrice;
    }
    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }
    @Override
    public String toString() {
        return "Product [id=" + id + ", productName=" + productName + ", productDescription=" + productDescription
                + ", productPrice=" + productPrice + "]";
    }

    
}
