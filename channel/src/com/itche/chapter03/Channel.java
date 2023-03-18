package com.itche.chapter03;

public class Channel {
    private String info="www.mldn.cn";
    private String connect(){
        return "【channel父类】进行的资源连接。";
    }
    public void fun(){
        System.out.println(this.connect());
    }
    public String getInfo(){
        return this.info;
    }

}