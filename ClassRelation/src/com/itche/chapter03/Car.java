package com.itche.chapter03;

import com.sun.org.apache.xml.internal.utils.res.XResourceBundle;

public class Car {
    private String name;
    private double price;
    private Person person;
    public Car(String name,double price){
        this.name=name;
        this.price=price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Person getPerson() {
        return this.person;
    }
    public String getCarInfo(){
        return "汽车品牌为"+this.name+"、价格为"+this.price;
    }

}
