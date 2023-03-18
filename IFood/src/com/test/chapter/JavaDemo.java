package com.test.chapter;

import com.itche.chapter03.Bread;
import com.itche.chapter03.Factory;
import com.itche.chapter03.IFood;

public class JavaDemo {
    public static void main(String[] args) {
       IFood food= Factory.getInstance("Bread");
       food.eat();
    }
}
