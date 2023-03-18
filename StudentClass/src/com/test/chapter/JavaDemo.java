package com.test.chapter;

import com.itche.chapter03.Student;

public class JavaDemo {
    public static void main(String[] args) {
        Student stu=new Student("张三","天安门",'男',21,67.32,86.42);
        System.out.println(stu.getInfo());
    }
}
