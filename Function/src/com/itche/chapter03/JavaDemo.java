package com.itche.chapter03;

import com.test.chapter.IFunction;
import com.test.chapter.Person;

public class JavaDemo {
    public static void main(String[] args) {
        IFunction<Person> fun= Person::new;
        System.out.println(fun.creat("张三",18));
    }
}
