package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        String str="2497797";//要判断的数
        String regex="\\w{2,}";//正则表达式
        System.out.println(str.matches(regex));
    }
}
