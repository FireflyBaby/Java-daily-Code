package com.test.chapter;
import java.util.function.*;
public class JavaDemo {
    public static void main(String[] args) {
        Consumer<String>con=System.out::println;
        con.accept("www.mldn.cn");
    }
}
