package com.pluralsight;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> inventory = Product.getInventory();

        System.out.println("We carry the following inventory: ");

        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f\n",
                    p.getId(), p.getName(), p.getPrice());
        }

    }
}
