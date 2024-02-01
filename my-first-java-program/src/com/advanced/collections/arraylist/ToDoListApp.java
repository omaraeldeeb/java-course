package com.advanced.collections.arraylist;
import java.util.ArrayList;
import java.util.Collections;


public class ToDoListApp {
    public static void main(String[] args) {
        ArrayList<String> urgentTasks = new ArrayList<>();
        ArrayList<String> allTasks = new ArrayList<>();

        urgentTasks.add("3 - pay pills");
        urgentTasks.add("1 - put fuel in the car");
        urgentTasks.add("2 - coding");

        allTasks.add("5 - Play");
        allTasks.add("7 - clean the room");
        allTasks.add("6 - watch a movie");

        allTasks.addAll(urgentTasks);
        Collections.sort(allTasks);
        for (String task : allTasks){
            System.out.println(task);
        }
        System.out.println("--------------------------------");


    }
}
