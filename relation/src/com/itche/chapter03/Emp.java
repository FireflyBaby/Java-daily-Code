package com.itche.chapter03;

public class Emp {
    private long empno;
    private String ename;
    private String job;
    private double sal;
    private double comm;
    private Dept dept;//所属部门
    private Emp mgr;//所属领导
    public Emp(){}
    public Emp(long empno,String ename,String job,double sal,double comm){
        this.empno=empno;
        this.ename=ename;
        this.job=job;
        this.sal=sal;
        this.comm=comm;
    }

    public void setEmpno(long empno) {
        this.empno = empno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public void setComm(double comm) {
        this.comm = comm;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }

    public void setMgr(Emp mgr) {
        this.mgr = mgr;
    }

    public long getEmpno() {
        return empno;
    }

    public String getEname() {
        return ename;
    }

    public String getJob() {
        return job;
    }

    public double getSal() {
        return sal;
    }

    public double getComm() {
        return comm;
    }
    public Dept getDept(){
        return this.dept;
    }

    public Emp getMgr() {
        return this.mgr;
    }

    public String getInfo(){
        return "【雇员信息】雇员编号="+this.empno+"、雇员姓名="+this.ename+"、雇员职位"+this.job+"、基本工资="+this.sal+"、佣金="+this.comm;
    }
}
