package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<String> inventory = getInventory();

        inventory.add("Ergonomic Mouse");

        System.out.println("Print current number of products: " + inventory.size());
        System.out.println();
        for(String product : inventory){
            System.out.println(product);
        }

    }

    public static ArrayList<String> getInventory(){
    ArrayList<String> products = new ArrayList<String>();

        products.add("Laptop (MacBook Pro)");
        products.add("Mechanical Keyboard");
        products.add("Ergonomic Office Chair");
        products.add("27-inch 4K Monitor");
        products.add("Noise-Canceling Headphones");

        return products;
    }
}
