package com.itche.chapter03;

import java.util.Objects;

public class Book implements IGoods{
    private String name;
    private double price;
    public Book(String name,double price){
        this.name=name;
        this.price=price;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    /*public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && Objects.equals(name, book.name);
    }*/
    public boolean equals(Object obj){
        if (obj==null){
            return false;
        }
        if (!(obj instanceof Book)){
            return false;
        }
        if (this==obj){
            return false;
        }
        Book book=(Book) obj;
        return this.name.equals(book.name)&&this.price==book.price;
    }

    @Override
    public String toString() {
        return "【图书信息】名称："+this.name+"、价格："+this.price;
    }
}
