package com.itche.chapter03;

public class Student extends Person {
    public Student(String name){
        setName(name);
    }
    public void nameInfo(){
        System.out.println(getName());
    }
}
