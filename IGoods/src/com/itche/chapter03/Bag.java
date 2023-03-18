package com.itche.chapter03;

public class Bag implements IGoods{
    private String name;
    private double price;
    public Bag(String name,double price){
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
        if (!(obj instanceof Bag)){
            return false;
        }
        if (this==obj){
            return false;
        }
        Bag bag=(Bag) obj;
        return this.name.equals(bag.name)&&this.price==bag.price;
    }

    @Override
    public String toString() {
        return "【书包信息】名称："+this.name+"、价格："+this.price;
    }
}
