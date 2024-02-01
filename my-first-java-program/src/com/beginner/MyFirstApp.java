package com.beginner;
import java.util.Locale;
import java.util.Scanner;

public class MyFirstApp {

    public static void main(String[] args){
        System.out.println("Who is named as the father of the light bulb");
        System.out.println("A: Nikola Tesla - B: Marie Curie - C: Tomas Edison - D: Robert Oppenheimer");
        Scanner sc= new Scanner(System.in);
        String fatherOfLightBulb= sc.next().toLowerCase(Locale.ROOT);
        switch (fatherOfLightBulb){
            case "a":
            case "b":
            case "d":
                System.out.println("Incorrect");
                break;
            case "c":
                System.out.println("Correct, congratulations you won 1$");
                break;
            default:
                System.out.println("please enter a valid choice");
        }
    }
}
