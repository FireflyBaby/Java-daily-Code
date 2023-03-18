package com.test.chapter;

import com.itheme.chapter03.User;

public class JavaDemo {
    public static void main(String[] args) {
        User.setCount();
        User userA=new User();
        User userB=new User("小强");
        User userC=new User("大强","我不行");
        System.out.println(userA.getInfo());
        System.out.println(userB.getInfo());
        System.out.println(userC.getInfo());
        System.out.println(User.getCount());
    }
}
