package com.itche.chapter;

import java.util.*;

public class JavaDemo {
    public static void main(String[] args) {
        HashMap<Person, String> map = new HashMap<Person,String>();
        map.put(new Person("小强",78),"林弱");//使用自定义作为Key
        System.out.println(map.get(new Person("小强",78)));//通过key找到value

    }
}
