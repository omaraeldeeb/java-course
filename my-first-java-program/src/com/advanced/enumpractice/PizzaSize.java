package com.advanced.enumpractice;

public enum PizzaSize {
    SMALL("Small Size"), MEDIUM("Medium Size") , LARGE("Large Size");
    private String pizzaSizeText;

    PizzaSize(String pizzaSizeText) {
        this.pizzaSizeText = pizzaSizeText;
    }

    public String getPizzaSizeText() {
        return pizzaSizeText;
    }
    //    SMALL "Small Pizza", MEDIUM "Medium Pizza" , LARGE "Large Pizza";
}
