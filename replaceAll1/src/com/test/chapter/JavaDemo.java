package com.test.chapter;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDemo {
    public static void main(String[] args) {
        //要求取出”#{内容}“标记中的所有内容
        String str="INSERT INTO dept(deptno,dname,loc) VALUES(#{deptno},#{dname},#{loc})";
        String regex="#\\{\\w+\\}";
        Pattern pat=Pattern.compile(regex);
        Matcher mat= pat.matcher(str);
        while (mat.find()){//是否有匹配成功的内容
            System.out.println(mat.group(0).replaceAll("#|\\{|\\}",""));
        }
    }
}
