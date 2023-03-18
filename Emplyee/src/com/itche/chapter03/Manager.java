package com.itche.chapter03;

public class Manager extends Employee{//管理层
    private String job;
    private double income;
    public Manager(){}
    public Manager(String name,int age,String sex,String job,double income){
        super(name,age,sex);
        this.job=job;
        this.income=income;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setIncome(double income) {
        this.income = income;
    }

    public String getJob() {
        return this.job;
    }

    public double getIncome() {
        return this.income;
    }
    public String getInfo(){
        return "【管理层】"+super.getInfo()+"、职务："+this.job+"、年薪"+this.income;
    }
}
