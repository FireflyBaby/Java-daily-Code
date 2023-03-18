package com.itche.chapter03;

public class Inner {
    private Outer outer;
    public Inner(Outer outer){
        this.outer=outer;
    }
    public void print(){
        System.out.println(this.outer.getMsg());
    }
}
