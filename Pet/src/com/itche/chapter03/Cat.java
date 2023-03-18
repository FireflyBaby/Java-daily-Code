package com.itche.chapter03;

import java.util.Objects;

public class Cat implements IPet{//实现宠物标准
    private String name;
    private String color;
    public Cat(String name,String color){
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
        if (obj == null || !(obj instanceof Cat)) return false;
        Cat cat = (Cat) obj;
        return Objects.equals(this.name, cat.name) && Objects.equals(this.color, cat.color);
        //return this.name.equals(cat.name)&&this.color.equals(cat.color);
    }


    @Override
    public String toString() {
        return "Cat{" +
                "name='" + this.name + '\'' +
                ", color='" + this.color + '\'' +
                '}';
    }
}
