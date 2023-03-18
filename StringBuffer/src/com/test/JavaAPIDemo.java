package com.test;

public class JavaAPIDemo {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer("Hello");
        change(buf);
        System.out.println(buf.toString());

    }
    public static void change(StringBuffer temp){//内容并没有发生改变
        temp.append(" World!");
    }
}
