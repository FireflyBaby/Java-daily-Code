package com.itche.chapter03;

public class Person implements Comparable<Person> {
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
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    @Override
    public String toString() {
        return "【Persom类对象】姓名："+this.name+"、年龄"+this.age+"\n";
    }

    @Override
    public int compareTo(Person per) {
        if (this.age> per.age){
            return -1;
        }else if (this.age< per.age){
            return 1;
        }else {
            return 0;
        }
    }
}
