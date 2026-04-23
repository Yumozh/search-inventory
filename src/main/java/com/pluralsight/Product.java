package com.pluralsight;

import java.util.ArrayList;

public class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static ArrayList<Product> getInventory(){

        ArrayList<Product> products = new ArrayList<>();

        products.add(new Product(101, "Mechanical Keyboard", 89.99));
        products.add(new Product(102, "Wireless Mouse", 45.50));
        products.add(new Product(103, "UltraWide Monitor", 349.00));
        products.add(new Product(104, "USB-C Hub", 25.00));
        products.add(new Product(105, "Desk Mat", 15.75));

        return products;
    }
}
