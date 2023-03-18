package com.test.chapter;

import com.itche.chapter.Student;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        String input="张三:21:98|李四:22:89|王五:20:70";
        String result[]=input.split("\\|");
        Student student[]=new Student[result.length];
        for (int x=0;x<result.length;x++){
            String temp[]=result[x].split(":");
            student[x]=new Student(temp[0],Integer.parseInt(temp[1]),Double.parseDouble(temp[2]));
        }
        Arrays.sort(student);
        System.out.println(Arrays.toString(student));
    }
}
