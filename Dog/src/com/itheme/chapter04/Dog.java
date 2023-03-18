package com.itheme.chapter04;

public class Dog {
    private String name;
    private String color;
    private int age;
    public Dog(){}
    public Dog(String name,String color,int age){
        this.name=name;
        this.age=age;
        this.color=color;

    }

    public void setName(String name) {
        this.name = name;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                '}';
    }
}
