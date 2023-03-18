package com.itche.chapter03;

public class Computer {
    private static int count=0;//生产个数
    private String name;
    private double price;

    public Computer(String name,double price) {
        this.name=name;
        this.price=price;
        count++;
    }
    @Override
    public String toString() {
        return "【第"+count+"台电脑】，电脑名字："+this.name+",价值："+this.price;
    }
}
