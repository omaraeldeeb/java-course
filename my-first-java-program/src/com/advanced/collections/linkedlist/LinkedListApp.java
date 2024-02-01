package com.advanced.collections.linkedlist;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListApp {
    public static void main(String[] args) {
        LinkedList<String> morningRoutine = (new LinkedList<>());

        Scanner userInput;
        String input;
        do {
            userInput = new Scanner(System.in);
            input = userInput.next();

            morningRoutine.push(input);
        } while (!input.equals("quit"));



    for (String routine : morningRoutine){
        System.out.println(routine);
    }

    }
}
