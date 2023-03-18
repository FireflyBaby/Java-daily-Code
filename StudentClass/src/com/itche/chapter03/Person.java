package com.itche.chapter03;

public class Person {
    private String name;
    private String addr;
    private char sex;
    private int age;
    public Person(){}
    public Person(String name,String addr){
        this(name,addr,'男',0);
    }
    public Person(String name,String addr,char sex,int age){
        this.name=name;
        this.addr=addr;
        this.sex=sex;
        this.age=age;
    }
    public String getInfo(){
        return "姓名："+this.name+"、地址："+this.addr+"、性别："+this.sex+"、年龄"+this.age;
    }
}
