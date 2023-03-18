package com.test.chapter;

import com.itche.chapter03.IMath;


public class JavaDemo {
    public static void main(String[] args) {
        IMath math=(t1,t2)->t1+t2;
        System.out.println(math.add(10,20));
        math.print();
    }
}
