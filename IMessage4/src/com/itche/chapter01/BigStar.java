package com.itche.chapter01;

public class BigStar implements Star{
    private String name;

    public BigStar(String name) {
        this.name = name;
    }
    public String sing(String singName){
        System.out.println(this.name+"正在唱"+singName);
        return "谢谢，谢谢！";
    }
    public void dance(){
        System.out.println(this.name+"正在优美的跳舞~~");
    }
}
