package com.beginner;

public class FunctionPractice {
    public static void main(String[] args) {
        System.out.println(energyEfficiencyCategory('f'));
        System.out.println();
        carDescription("Tesla", 2023, "New");
    }
    static String energyEfficiencyCategory(char category){
        return switch (category) {
            case 'a', 'A' -> "very low";
            case 'b', 'B' -> "low";
            case 'c', 'C' -> "normal";
            case 'd', 'D' -> "above normal";
            case 'e', 'E' -> "high";
            case 'f', 'F' -> "very high";
            case 'g', 'G' -> "extremely high";
            default -> "undefined category";
        };
    }
    static void carDescription(String model, int productionYear, String condition){
        System.out.println("The car model: " + model);
        System.out.println("The production year: " + productionYear);
        System.out.println("The condition of the car: " + condition);
    }

}
