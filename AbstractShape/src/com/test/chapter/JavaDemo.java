package com.test.chapter;

import com.itche.chapter03.AbstractShape;
import com.itche.chapter03.Factory;

public class JavaDemo {
    public static void main(String[] args) {
        AbstractShape abs= Factory.getInstance("Circular",3.1);
        AbstractShape abs1=Factory.getInstance("Rectangle",3.2,2.3);
        System.out.println("圆形面积："+abs.area()+"、圆形周长："+abs.perimeter() );
        System.out.println("矩形面积："+abs1.area()+"、矩形周长："+abs1.perimeter() );
    }
}
