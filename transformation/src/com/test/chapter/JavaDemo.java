package com.test.chapter;

import com.itche.chapter03.Menber;
import com.itche.chapter03.Privilege;
import com.itche.chapter03.Role;

public class JavaDemo {
    public static void main(String[] args) {
        //根据结构设置对象数据
        Menber menberA=new Menber("mldn-a","张三");
        Menber menberB=new Menber("mldn-b","李四");
        Role roleA=new Role(1L,"系统配置");
        Role roleB=new Role(2l,"备份服务");
        Role roleC=new Role(3L,"人事管理");
        Privilege priA=new Privilege(1000L,"系统初始化");
        Privilege priB=new Privilege(1001L,"系统还原");
        Privilege priC=new Privilege(1002L,"系统环境修改");
        Privilege priD=new Privilege(2000L,"备份数据");
        Privilege priE=new Privilege(2001L,"备份部门数据");
        Privilege priF=new Privilege(2002L,"备份公文数据");
        Privilege priG=new Privilege(3000L,"增加员工");
        Privilege priH=new Privilege(3001L,"编辑员工");
        Privilege priI=new Privilege(3002L,"浏览员工");
        Privilege priJ=new Privilege(3003L,"员工离职");
        //增加角色与权限的对应关系
        roleA.setPrivileges(new Privilege[]{priA,priB,priC});
        roleB.setPrivileges(new Privilege[]{priD,priE,priF});
        roleC.setPrivileges(new Privilege[]{priG,priH,priI,priJ});
        //增加权限与角色对应
        priA.setRoles(roleA);
        priB.setRoles(roleA);
        priC.setRoles(roleA);
        priD.setRoles(roleB);
        priE.setRoles(roleB);
        priF.setRoles(roleB);
        priG.setRoles(roleC);
        priH.setRoles(roleC);
        priI.setRoles(roleC);
        priJ.setRoles(roleC);
        //增加用户与角色的对应关系
        menberA.setRoles(new Role[]{roleA,roleB});
        menberB.setRoles(new Role[]{roleA,roleB,roleC});
        roleA.setMenbers(new Menber[]{menberA,menberB});
        roleB.setMenbers(new Menber[]{menberA,menberB});
        roleC.setMenbers(new Menber[]{menberB});
        //根据要求获取数据
        System.out.println("===========通过用户查找信息==================");
        System.out.println(menberB.getInfo());
        for(int i=0;i<menberB.getRoles().length;i++){
            System.out.println("\t|-"+menberB.getRoles()[i].getInfo());
            for (int j=0;j<menberB.getRoles()[i].getPrivileges().length;j++){
                System.out.println("\t\t|-"+menberB.getRoles()[i].getPrivileges()[j].getInfo());
            }
        }
        System.out.println("===========通过角色查找信息==================");
        System.out.println(roleB.getInfo());
        System.out.println("浏览此角色下的所有信息：");
        for(int i=0;i<roleB.getPrivileges().length;i++){
            System.out.println("\t\t|-"+roleB.getPrivileges()[i].getInfo());
        }
        System.out.println("浏览此角色下的所有用户信息：");
        for(int i=0;i<roleB.getMenbers().length;i++){
            System.out.println("\t\t|-"+roleB.getMenbers()[i].getInfo());
        }
        System.out.println("通过权限查找信息：");
        System.out.println(priA.getInfo());
        for(int i=0;i<priA.getRoles().getMenbers().length;i++){
            System.out.println("\t\t|-"+priA.getRoles().getMenbers()[i].getInfo());
        }
    }
}
