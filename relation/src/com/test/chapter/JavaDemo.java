package com.test.chapter;

import com.itche.chapter03.Dept;
import com.itche.chapter03.Emp;

public class JavaDemo {
    public static void main(String[] args) {
        //第一步：根据关系进行类的定义
        //定义出各个的实例化对象，此时并没有任何的关联定义
        Dept dept=new Dept(10,"财务部","上海");
        Emp empA=new Emp(7369L,"SMITH","CLERK",800.00,0.0);
        Emp empB=new Emp(7566L,"FORD","MANAGER",2450.00,0.0);
        Emp empC=new Emp(7839L,"KING","PRESIDENT",5000.00,0.0);
        //需要为对象进行关联的设置
        empA.setDept(dept);//设置雇员与部门的关联
        empB.setDept(dept);
        empC.setDept(dept);
        empA.setMgr(empB);//设置雇员与领导的关联
        empB.setMgr(empC);
        dept.setEmps(new Emp[]{empA,empB,empC});//部门与雇员
        //根据关系获取数据
        System.out.println(dept.getInfo());//部门信息
        for(int i=0;i<dept.getEmps().length;i++){
            System.out.println("\t-|"+dept.getEmps()[i].getInfo());
            if(dept.getEmps()[i].getMgr()!=null){
            System.out.println("\t\t-|"+dept.getEmps()[i].getMgr().getInfo());
            }
        }
        System.out.println("---------------------------------------------------------");
        System.out.println(empB.getDept().getInfo());//根据雇员获取部门信息
        System.out.println(empB.getMgr().getInfo());//根据雇员获取领导信息


    }
}
