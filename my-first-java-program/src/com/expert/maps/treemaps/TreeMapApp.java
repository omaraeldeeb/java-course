package com.expert.maps.treemaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapApp {

    public static void main(String[] args) {

        Map<String, Double> productsHashMap = new HashMap<>();
        productsHashMap.put("Chocolate bar", 1.5);
        productsHashMap.put("Pasta", 1.1);
        productsHashMap.put("Cereals", 1.7);
        productsHashMap.put("Apple", 0.15);
        productsHashMap.put(null, 99.99);

        System.out.println("HashMap:");
        for (String product : productsHashMap.keySet()) {
            System.out.println(product + " $" + productsHashMap.get(product));
        }
        System.out.println("-----------------------");
        Map<String, Double> productsLinkedHashMap = new LinkedHashMap<>();
        productsLinkedHashMap.put("Chocolate bar", 1.5);
        productsLinkedHashMap.put("Pasta", 1.1);
        productsLinkedHashMap.put("Cereals", 1.7);
        productsLinkedHashMap.put("Apple", 0.15);
        productsLinkedHashMap.put(null, 99.99);


        System.out.println("LinkedHashMap:");
        for (String product : productsLinkedHashMap.keySet()) {
            System.out.println(product + " $" + productsLinkedHashMap.get(product));
        }
        System.out.println("-----------------------");
        Map<String, Double> productsTreeMap = new TreeMap<>();
        productsTreeMap.put("Chocolate bar", 1.5);
        productsTreeMap.put("Pasta", 1.1);
        productsTreeMap.put("Cereals", 1.7);
        productsTreeMap.put("Apple", 0.15);


        System.out.println("TreeMap:");
        for (String product : productsTreeMap.keySet()) {
            System.out.println(product + " $" + productsTreeMap.get(product));
        }

    }
}
