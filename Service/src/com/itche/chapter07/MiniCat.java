package com.itche.chapter07;

public class MiniCat extends Cat{
    public int level;

    public MiniCat(String name, int age, int level) {
        super(name, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "MiniCat{" +
                "name='" + name + '\'' +
                ", level=" + level +
                '}';
    }
}
