package com.test.chapter;

import com.itche.chapter03.IFunction;

public class JavaDemo {
    public static void main(String[] args) {
        IFunction<String> fun=String::compareTo;
        System.out.println(fun.compare("A","a"));
    }
}
