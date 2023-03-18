package com.mldn.chapter;

public class Person {
    public Person(){//无参构造方法
        System.out.println("*************Person类构造方法***************");
    }
    @Override
    public String toString() {
        return "我是一个人，一个脱离了低级趣味的人！";
    }
}
