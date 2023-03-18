package com.itche.chapter16;

public class Student implements Comparable<Student>{
    private long sid;
    private String name;
    private int vote;
    public Student(long sid, String name, int vote) {
        this.sid = sid;
        this.name = name;
        this.vote = vote;
    }
    public long getSid() {
        return sid;
    }
    public String getName() {
        return name;
    }
    public int getVote() {
        return vote;
    }
    public void setSid(long sid) {
        this.sid = sid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setVote(int vote) {
        this.vote = vote;
    }
    @Override
    public String toString() {
        return "【"+this.sid+"】姓名："+this.name+"、票数"+this.vote;
    }
    @Override
    public int compareTo(Student stu) {
        return stu.vote-this.vote;
    }
}
