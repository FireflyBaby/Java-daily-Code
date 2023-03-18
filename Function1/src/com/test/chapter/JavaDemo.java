package com.test.chapter;
import java.util.function.*;

public class JavaDemo {
    public static void main(String[] args) {
        Function<String,Boolean>fun="**Hello"::startsWith;
        System.out.println(fun.apply("**"));
    }
}
