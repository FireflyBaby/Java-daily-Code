package com.test.chapter;

import com.itche.chapter03.Company;
import com.itche.chapter03.IClassname;

public class JavaDemo {
    public static void main(String[] args) {
        IClassname isn=new Company();
        System.out.println(isn.getClassName());
    }
}
