package com.itche.chapter16;

import java.util.Arrays;

public class VoteServiceImpl implements IVoteService{
    private Student[] students=new Student[]{
            new Student(1,"张三",0),
            new Student(2,"李四",0),
            new Student(3,"王五",0),
            new Student(4,"赵六",0)};
    @Override
    public boolean inc(long sid) {
        for (int x=0;x< students.length;x++){
            if (this.students[x].getSid()==sid){
                this.students[x].setVote(this.students[x].getVote()+1);//票数增长
                return true;
            }
        }
        return false;
    }
    @Override
    public Student[] result() {
        Arrays.sort(this.students);
        return this.students;
    }
    @Override
    public Student[] getData() {
        return this.students;
    }
}
