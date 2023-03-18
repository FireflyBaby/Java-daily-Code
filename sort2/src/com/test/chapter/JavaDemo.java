package com.test.chapter;

import com.itche.chapter03.IHandle;
import com.itche.chapter03.Student;
import com.itche.chapter03.StudentHandle;

public class JavaDemo {
    public static void main(String[] args) {
        String str="张三:21:98|李四:22:89|王五:20:70";
        IHandle<Student> handle=new StudentHandle(str);
        Student result[]= handle.result();
        for (Student stu:result) {
            System.out.println(stu);
        }

    }
}
