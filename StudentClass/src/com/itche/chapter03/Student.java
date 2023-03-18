package com.itche.chapter03;

public class Student extends Person{
    private double math;
    private double english;
    public Student(){}
    public Student(String name,String addr){
        super(name, addr);
    }
    public Student(String name,String addr,char sex,int age,double math,double english){
        super(name, addr, sex, age);
        this.math=math;
        this.english=english;
    }
    public String getInfo(){
        return super.getInfo()+"、数学成绩："+this.math+"、英语成绩："+this.english;
    }
}
