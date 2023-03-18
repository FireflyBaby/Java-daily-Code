package com.itche.chapter03;

public class Dept {
    private long deptno;
    private String dname;
    private String loc;
    private Emp [] emps;
    public Dept(){}
    public Dept(long deptno,String dname,String loc){
        this.deptno=deptno;
        this.dname=dname;
        this.loc=loc;
    }

    public void setDeptno(long deptno) {
        this.deptno = deptno;
    }

    public void setDname(String dname) {
        this.dname = dname;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public void setEmps(Emp[] emps) {
        this.emps = emps;
    }

    public long getDeptno() {
        return deptno;
    }

    public String getDname() {
        return dname;
    }

    public String getLoc() {
        return loc;
    }

    public Emp[] getEmps() {
        return this.emps;
    }

    public String getInfo(){
        return "【部门信息】部门编号="+this.deptno+"、部门名称="+this.dname+"、部门位置="+this.loc;
    }
}
