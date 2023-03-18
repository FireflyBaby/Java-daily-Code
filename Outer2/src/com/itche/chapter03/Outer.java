package com.itche.chapter03;

public class Outer {
    private String info="www.mldn.cn";
    public void fun(long time){
        class Inner{
            public void print(){
                System.out.println(Outer.this.info);
                System.out.println(time);
            }
        }
        new Inner().print();
    }
}
