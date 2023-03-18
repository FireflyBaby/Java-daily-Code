package com.itcge.chapter03;

public class Person implements Comparable<Person>{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "姓名："+this.name+" 年龄："+this.age+'\n';
    }

    @Override
    public int compareTo(Person o) {
        return this.age-o.age;
    }
}
