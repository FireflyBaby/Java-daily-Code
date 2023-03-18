package com.test.chapter;

import com.itche.chapter03.Validator;

public class JavaDemo {
    public static void main(String[] args) {
        String str="192.168.1.2";
        System.out.println(Validator.validateIP(str));
    }
}
