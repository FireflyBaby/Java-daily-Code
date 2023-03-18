package com.itche.chapter01;

public class JavaDemo {
    public static void main(String[] args) {
        String value="empno:7369|ename:Smith|job:Clerk|salary:750.00|hiredate:1989-10-10|dept.dname:财务部|dept.company.name:MLDN";
        Emp emp= ClassInstanceFactory.create(Emp.class, value);
        System.out.println("雇员编号："+emp.getEmpno()+"、姓名："+emp.getEname()+"、职位："+emp.getJob()+"、基本工资："+emp.getSalary()+"、雇佣日期："+emp.getHiredate()+
        "、部门名称："+emp.getDept().getDname()+"、公司名称："+emp.getDept().getCompany().getName());

    }
}
