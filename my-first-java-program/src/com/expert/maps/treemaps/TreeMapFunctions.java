package com.expert.maps.treemaps;
import java.util.TreeMap;

public class TreeMapFunctions {

    public static void main(String[] args) {
        TreeMap<String, Double> productsTreeMap = new TreeMap<>();
        productsTreeMap.put("Chocolate bar", 1.5);
        productsTreeMap.put("Pasta", 1.1);
        productsTreeMap.put("Cereals", 1.7);
        productsTreeMap.put("Tea ", 3.2);
        productsTreeMap.put("Apple", 0.15);
        productsTreeMap.put("Orange", 0.10);


        System.out.println("TreeMap:");
        for (String product : productsTreeMap.keySet()) {
            System.out.println(product + " $" + productsTreeMap.get(product));
        }



    }
}
