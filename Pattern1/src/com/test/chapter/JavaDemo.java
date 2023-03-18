package com.test.chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDemo {
    public static void main(String[] args) {
        String str="7979*))&7HIHI&)()^((gjgufHHJc7";
        String regex="\\D";
        Pattern pat=Pattern.compile(regex);//编译正则表达式
        Matcher mat= pat.matcher(str);
        System.out.println(mat.replaceAll(""));
    }
}
