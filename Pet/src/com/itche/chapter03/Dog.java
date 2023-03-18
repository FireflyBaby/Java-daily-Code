package com.itche.chapter03;

import java.util.Objects;

public class Dog implements IPet{//实现宠物标准
    private String name;
    private String color;
    public Dog(String name,String color){
        this.name=name;
        this.color=color;
    }
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || !(obj instanceof Dog)) return false;
        Dog dog = (Dog) obj;
        return Objects.equals(this.name, dog.name) && Objects.equals(this.color, dog.color);
        //return this.name.equals(cat.name)&&this.color.equals(cat.color);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }
}

