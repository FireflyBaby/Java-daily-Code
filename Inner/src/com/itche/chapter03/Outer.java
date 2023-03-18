package com.itche.chapter03;

public class Outer {
    private String msg="www.mldn.cn";
    public class Inner{
        public void print(){
            System.out.println(Outer.this.msg);
        }
    }
}
