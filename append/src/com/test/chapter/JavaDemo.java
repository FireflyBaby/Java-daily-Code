package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer();
        buf.append("Hello mldn!").delete(6,10).insert(6,"World");
        System.out.println(buf.reverse());
    }
}
