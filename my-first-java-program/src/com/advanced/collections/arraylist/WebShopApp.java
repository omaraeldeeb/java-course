package com.advanced.collections.arraylist;

import java.util.ArrayList;

public class WebShopApp {
    public static void main(String[] args) {
        ArrayList <Product> products = new ArrayList<>();
        products.add(new Product("Iphone 15 pro max 1TB", 1299.99, "Powerful phone with a big screen"));
        products.add(new Product("Iphone 15 pro max 1TB", 1299.99, "Powerful phone with a big screen"));
        products.add(new Product("Iphone 15 pro  1TB", 1199.99, "Powerful phone with a average screen"));
        products.add(new Product("Earbuds Pro", 499.99, "High quality sound with NFC and waterproof"));
        products.add(new Product("Earbuds Pro", 499.99, "High quality sound with NFC and waterproof"));
        products.add(2, new Product("earphone", 99.99, "High quality sound"));
        products.set(4, new Product("Earbuds", 299.99, "High quality sound & waterproof"));

        //        System.out.println(products);

        for (Product product: products){
            System.out.println(product);
        }
        System.out.println("The third element in the list");
        System.out.println(products.get(2));

        System.out.println(products.size() + " products can be found in the list");

        System.out.println(products.get(0).equals(products.get(1)));
    }
}
