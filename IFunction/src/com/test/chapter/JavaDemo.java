package com.test.chapter;

import com.itche.chapter03.IFunction;

public class JavaDemo {
    public static void main(String[] args) {
        IFunction<Integer,String> fun=String::valueOf;
        System.out.println(fun.change(100).length());
    }
}
