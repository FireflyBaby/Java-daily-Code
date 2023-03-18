package com.itche.chapter03;

public class Employee {
    private String name;
    private int age;
    private String sex;
    public Employee(){}
    public Employee(String name,int age,String sex){
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getSex() {
        return this.sex;
    }
    public String getInfo(){
        return "姓名："+this.name+"、年龄："+this.age+"、性别"+this.sex;
    }
}
