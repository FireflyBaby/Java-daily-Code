package com.itheme.chapter03;

public class Book {
    private int bid;//编号
    private String title;//书名
    private double price;//书价
    private static int count=0;
    public Book(String title,double price){
        this.bid=count+1;
        this.title=title;
        this.price=price;
        count++;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static void setCount(int count) {
        Book.count = count;
    }

    public int getBid() {
        return bid;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public static int getCount() {
        return count;
    }
    public String getInfo(){
        return "图书编号："+this.bid+"、名称："+this.title+"、书价："+this.price;
    }
}
