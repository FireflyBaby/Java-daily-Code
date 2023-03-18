package com.itche.chapter03;

public class Staff extends Employee{
    private String dept;
    private double salary;
    public Staff(){}
    public Staff(String name,int age,String sex,String dept,double salary){
        super(name,age,sex);
        this.dept=dept;
        this.salary=salary;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDept() {
        return this.dept;
    }

    public double getSalary() {
        return this.salary;
    }
    public String getInfo(){
        return "【职员】"+super.getInfo()+"、部门"+this.dept+"、月薪"+this.salary;
    }
}
