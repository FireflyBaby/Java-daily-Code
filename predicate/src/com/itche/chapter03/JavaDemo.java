package com.itche.chapter03;

import java.util.function.Predicate;

public class JavaDemo {
    public static void main(String[] args) {
        Predicate<String>pre="MLDN"::equalsIgnoreCase;
        System.out.println(pre.test("mldn"));
    }
}
