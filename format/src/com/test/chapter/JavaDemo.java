package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String name="张三";
        int age=18;
        double score=98.765321;
        System.out.println(String.format("姓名:%s、年龄:%d、分数:%5.2f",name,age,score));
    }
}
