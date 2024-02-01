package com.advanced.exceptions;

public class DivideTwoNumbersException {

    public static void main(String[] args) {
        System.out.println(divide(10 , 2));
        System.out.println(divide(5 , 0));
        System.out.println("Done");



    }
    private static int divide (int dividend, int divisor){
        try {
            return dividend / divisor;

        }catch (ArithmeticException exception){
            System.out.println("Cannot divide by zero");
            exception.printStackTrace();
            return 0;
        }catch (NullPointerException exception){
            System.out.println("NullPointerException is thrown");
            return 0;
        }

    }
}
