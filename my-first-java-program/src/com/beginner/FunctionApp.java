package com.beginner;

public class FunctionApp {


    public static void main(String[] args) {
        sayHello();
        System.out.println();
        helloLove(2);
        System.out.println();
        System.out.println("The price after 10% discount is: "+tenPercentDiscount(30000));
        System.out.println("The price after 10% discount is: "+tenPercentDiscount(2950.70));
    }


        static void sayHello(){
            System.out.println("Hello!!!!");
        }
        static void helloLove(int love){
            for (int i = 1; i <= love; i++) {
                System.out.println(i + " Hello baby I love you");
            }
        }
        static double tenPercentDiscount (int price){
                return price * 0.9;
            }
        static double tenPercentDiscount (double price){
        return price * 0.9;
    }
}
