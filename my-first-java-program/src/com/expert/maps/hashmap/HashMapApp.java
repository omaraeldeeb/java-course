package com.expert.maps.hashmap;

import java.util.HashMap;
import java.util.Map;

public class HashMapApp {
public static void main(String[] args) {



    Map<String, String> capitals = new HashMap<>();

    capitals.put("India", "New Delhi");
    capitals.put("Egypt", "Cairo");
    capitals.put("United Kingdom", "London");
    capitals.put("USA", "New York");
    capitals.put("Sudan", "Khartoom");
    capitals.put("UAE", "Abu Dhabi");
    capitals.put("Sweden", "Stockholm");
    capitals.put("Egypt", "New Cairo");



    capitals.remove("Egypt", "New Cairo");
    System.out.println(capitals.get("Egypt"));

    for (String country : capitals.keySet()){
        System.out.println("-" + country);
    }


    if (capitals.containsValue("London")){
        System.out.println("UK is in the list");
    }

    capitals.put(null , "The city is not in the list");

    String userInput = "Qatar";
    if (capitals.containsKey(userInput)){
        System.out.println(capitals.get(userInput));
    }
    else {
        System.out.println(capitals.get(null));
    }
    capitals.remove(null);

    capitals.put("Egypt", "Cairo");

    System.out.println("-------------------------------");

    System.out.println(capitals.size() + " capitals can be found in the hashmap: ");
    for (String capital : capitals.values()){
        System.out.println("-" + capital);
    }
    capitals.clear();
    System.out.println("-------------------------------");
    System.out.println(capitals.size() + " countries can be found in the hashmap: ");
    for (String country : capitals.keySet()){
        System.out.println("-" + country);
    }




}
}