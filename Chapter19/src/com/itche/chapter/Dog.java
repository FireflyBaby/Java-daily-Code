package com.itche.chapter;

import java.io.Serializable;

public class Dog implements Serializable {
    private static final long SerialVersionUID=1L;
    private String name;
    private int age;
    public Dog(String name,int age) {
        this.name=name;
        this.age=age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
