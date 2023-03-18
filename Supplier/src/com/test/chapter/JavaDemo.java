package com.test.chapter;

import java.util.function.Supplier;

public class JavaDemo {
    public static void main(String[] args) {
        Supplier<String>sup="www.MLDN.cn"::toLowerCase;
        System.out.println(sup.get());
    }
}
