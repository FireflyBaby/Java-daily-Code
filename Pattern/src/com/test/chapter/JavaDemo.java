package com.test.chapter;

import java.util.regex.Pattern;

public class JavaDemo {
    public static void main(String[] args) {
        String str="&&(^GUT6gjhhh8*(&(^*%688*(GGjgi&(";
        String regex="[^a-zA-Z]+";
        Pattern pat=Pattern.compile(regex);//编译正则表达式
        String []result=pat.split(str);//拆分
        for (String temp:result) {
            System.out.print(temp+" ");
        }
    }
}
