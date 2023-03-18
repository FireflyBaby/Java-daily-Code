package com.test.chapter;

public class Member implements Cloneable{
    private String name;
    private int age;
    public Member(String name,int age){
        this.name=name;
        this.age=age;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();//调用父类中提供的clone()方法
    }

    @Override
    public String toString() {
        return "【"+super.toString()+"】name="+this.name+"、age="+this.age;
    }
}
