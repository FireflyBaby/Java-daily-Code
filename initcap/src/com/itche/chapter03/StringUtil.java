package com.itche.chapter03;

public class StringUtil {
    public static String initcap(String str) {
        if (str==null || "".equals(str)) {
            return str;//原样返回
        } else if (str.length() == 1) {
            return str.toUpperCase();
        } else {
            return str.substring(0,1).toUpperCase()+str.substring(1);
        }

    }
}
