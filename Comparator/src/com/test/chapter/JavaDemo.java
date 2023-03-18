package com.test.chapter;

import com.itche.chapter03.Person;
import com.itche.chapter03.PersonComparator;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        Person data[]=new Person[]{
                new Person("小强-A",80),
                new Person("小强-B",50),
                new Person("小强-C",100)
        };
        Arrays.sort(data,new PersonComparator());
        System.out.println(Arrays.toString(data));
    }
}
