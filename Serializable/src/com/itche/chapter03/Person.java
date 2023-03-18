package com.itche.chapter03;

import java.io.Serializable;

public class Person implements Serializable {//Person类可以被序列化
    private transient String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return "姓名："+this.name+"、年龄："+this.age;
    }
}
