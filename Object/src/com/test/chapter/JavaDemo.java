package com.test.chapter;

import com.itche.chapter.Person;

public class JavaDemo {
    public static void main(String[] args) {
        Person perA=new Person("朱瑞",26);
        Person perB=new Person("张三",18);
        if (perA.getName().equals(perB.getName())&&perA.getAge()==perB.getAge()){
            System.out.println("是同一个对象");
        }else{
            System.out.println("不是同一个对象");
        }

    }
}
