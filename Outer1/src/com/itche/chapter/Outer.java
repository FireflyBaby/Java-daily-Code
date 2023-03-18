package com.itche.chapter;

public class Outer {
    private static final String MSG="www.mldn.cn";
    public static class Inner{
        public void print(){
            System.out.println(Outer.MSG);
        }
    }
}
