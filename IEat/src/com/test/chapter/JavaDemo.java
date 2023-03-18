package com.test.chapter;

import com.itche.chapter03.EatProxy;
import com.itche.chapter03.EatReal;
import com.itche.chapter03.IEat;

public class JavaDemo {
    public static void main(String[] args) {
        IEat eat=new EatProxy(new EatReal());
        eat.get();
    }
}
