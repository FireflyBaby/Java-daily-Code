package com.test.chapter;

import com.itche.chapter03.Outer;

public class JavaDemo {
    public static void main(String[] args) {
        Outer.Inner in=new Outer().new Inner();
        in.print();
    }
}
