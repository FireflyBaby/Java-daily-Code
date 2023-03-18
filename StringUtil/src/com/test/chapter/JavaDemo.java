package com.test.chapter;

import com.itche.chapter03.StringUtil;

public class JavaDemo {
    public static void main(String[] args) {
        String str="want you to know one thing";
        int count[]= StringUtil.count(str);
        System.out.println("n的个数"+count[0]);
        System.out.println("o的个数"+count[1]);
    }
}
