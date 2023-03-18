package com.itche.chapter13;

public class Student implements Comparable<Student>{
    private String name;
    private double score;
    public Student(String name,double score){
        this.name=name;
        this.score=score;
    }

    @Override
    public String toString() {
        return "姓名:"+this.name+"、年龄："+this.score;
    }

    @Override
    public int compareTo(Student obj) {
        if (this.score>obj.score){
            return -1;
        }else if (this.score<obj.score){
            return 1;
        }else {
            return 0;
        }
    }
}
