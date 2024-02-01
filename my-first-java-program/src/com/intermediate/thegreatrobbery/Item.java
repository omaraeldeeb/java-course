package com.intermediate.thegreatrobbery;

public class Item {
    private String itemName;
    private double itemValue;

    public Item(String itemName, double itemValue) {
        this.itemName = itemName;
        this.itemValue = itemValue;
    }

    public String getItemName() {
        return itemName;
    }
    public double getItemValue() {
        return itemValue;
    }
}
