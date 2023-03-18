package com.itche.chapter03;

public class DatabaseChannel extends Channel{
    private String info="mldn";
    public String connect(){

        return "【子类】进行数据库资源的连接。";
    }
    public void fun(){
        System.out.println(this.info);
        System.out.println(super.getInfo());
    }
}
