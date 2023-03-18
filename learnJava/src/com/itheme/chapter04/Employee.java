package com.itheme.chapter04;

public class Employee {
    private long empno;
    private String ename;
    private double salary;
    private double rate;
    public Employee(){}
    public Employee(long empno,String ename,double salary,double rate){
        this.empno=empno;
        this.ename=ename;
        this.salary=salary;
        this.rate=rate;

    }
    public double salaryIncValue(){//得到薪水额度
        return this.salary*this.rate;
    }
    public double salaryIncResult(){
        return this.salary*(1+this.rate);
    }
    public String getInfo(){
        return "雇员编号："+this.empno+"、雇员姓名："+this.ename+"、雇员薪水："+this.salary+"、工资增长率："+this.rate;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public long getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public double getSalary() {
        return salary;
    }

    public double getRate() {
        return rate;
    }
}
