package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
        Person per=new Person("张三",18,Sex.getInstance("male"));
        System.out.println(per.toString());
    }
}
