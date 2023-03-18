package com.itche.chapter03;

public class Person {
    private String name;
    private int age;
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }
    @Override
    public boolean equals(Object obj){
        if (!(obj instanceof Person)){
            return false;
        }
        if (obj==null){
            return false;
        }
        if (this==obj){
            return true;
        }
        Person per=(Person) obj;
        return this.name.equals(per.name)&&this.age== per.age;
    }
}
