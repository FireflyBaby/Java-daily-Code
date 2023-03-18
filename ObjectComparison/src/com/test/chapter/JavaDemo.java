package com.test.chapter;

import com.itche.chapter03.Person;

public class JavaDemo {
    public static void main(String[] args) {
        Person perA=new Person("张三",18);
        Person perB=new Person("李四",20);
        System.out.println(perA.equals("狗"));
    }
}
