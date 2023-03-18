package com.itche.chapter03;

public class Outer {
    private String msg="www.mldn.cn";
    public void fun(){
        Inner inner=new Inner(this);
        inner.print();
    }

    public String getMsg() {
        return this.msg;
    }
}
