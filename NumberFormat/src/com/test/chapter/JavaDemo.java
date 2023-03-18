package com.test.chapter;

import java.text.NumberFormat;

public class JavaDemo {
    public static void main(String[] args) {
        double money=3279427424028.424;
        String str= NumberFormat.getInstance().format(money);
        System.out.println(str);
    }
}
