package com.itche.chapter03;

public class Person {
    private String name;
    private int age;
    private Car car;
    private  Person children[];
    public Person(String name,int age){
        this.name=name;
        this.age=age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setCar(Car car) {
        this.car = car;
    }
    public void setChildren(Person children[]){
        this.children=children;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public Car getCar() {
        return this.car;
    }

    public Person[] getChildren() {
        return this.children;
    }

    public String getPersonInfo(){
        return "姓名为："+this.name+"、年龄为"+this.age;
    }
}
