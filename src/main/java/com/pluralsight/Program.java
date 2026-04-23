package com.pluralsight;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Pattern;

public class Program {
    public static void main(String[] args) {

//        ArrayList<Product> inventory = Product.getInventory();

        try {
            FileReader fileReader = new FileReader("inventory.csv");
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            FileWriter fileWriter = new FileWriter("formated-inventory.csv");
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);
            ArrayList<Product> products = new ArrayList<>();
            String line = bufferedReader.readLine();


            while (line != null) {

                String[]fields = line.split(Pattern.quote("|"));

//                ArrayList<Product> products = new ArrayList<>();
                products.add(new Product(Integer.parseInt(fields[0].trim()), fields[1], Double.parseDouble(fields[2])));

                String text = String.format("id: %d %s - Price: $%.2f\n",
                                            p.getId(), p.getName(), p.getPrice());
                bufWriter.write(text);
                line = bufferedReader.readLine();
            }
            bufferedReader.close();
            bufWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }



//        System.out.println("We carry the following inventory: ");
//
//        for (Product p : inventory) {
//            System.out.printf("id: %d %s - Price: $%.2f\n",
//                    p.getId(), p.getName(), p.getPrice());
//        }

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
