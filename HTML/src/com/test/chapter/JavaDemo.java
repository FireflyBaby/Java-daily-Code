package com.test.chapter;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaDemo {
    public static void main(String[] args) {
        String str="<font face=\"Arial,Serif\" size=\"+2\" color=\"red\">";
        String regex="\\w+=\"[a-zA-Z0-9,\\+]+\"";
        Matcher matcher=Pattern.compile(regex).matcher(str);
        while (matcher.find()){
            String temp=matcher.group(0);
            String result[]= temp.split("=");
            System.out.println(result[0]+"\t"+result[1].replaceAll("\"",""));
        }
    }
}
