package com.itche.chapter;

public class Order {//订单信息
    private String name;
    private double price;
    private int amount;

    public Order(String name, double price, int amount) {
        this.name = name;
        this.price = price;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getAmount() {
        return amount;
    }
}
