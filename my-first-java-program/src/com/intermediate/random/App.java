package com.intermediate.random;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        Random randomNumber = new Random();
        int[] intArray = new int[5];
        intArray[0] = randomNumber.nextInt(50) + 1;
        intArray[1] = randomNumber.nextInt(50) + 1;
        intArray[2] = randomNumber.nextInt(50) + 1;
        intArray[3] = randomNumber.nextInt(50) + 1;
        intArray[4] = randomNumber.nextInt(50) + 1;
        for (int j : intArray) {
            System.out.print(j + " ");
        }
    }
}
