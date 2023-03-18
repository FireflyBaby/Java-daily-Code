package com.itche.chapter03;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private double score;

    public Student(String name, int age, double score) {
        this.name = name;
        this.age = age;
        this.score = score;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setScore(double score) {
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getScore() {
        return score;
    }

    @Override
    public String toString() {
        return String.format("姓名:%s,年龄：%s,分数：%s",this.name,this.age,this.score);
    }

    @Override
    public int compareTo(Student o) {
        if (this.score<o.score){
            return 1;
        }else if (this.score>o.score){
            return -1;
        }else{
            if (this.age<o.age){
                return -1;
            }else if (this.age>o.age){
                return 1;
            }else{
                return 0;
            }
        }
    }
}
