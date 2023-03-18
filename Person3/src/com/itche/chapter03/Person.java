package com.itche.chapter03;

public class Person {
    private String name;
    private int age;
    private Sex sex;
    public Person(String name,int age,Sex sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + this.name + '\'' +
                ", age=" + this.age +
                ", sex=" +this.sex.toString()+
                '}';
    }

}
