package com.itche.chapter;

import java.util.ArrayList;
import java.util.List;

public class JavaDemo {
    public static void main(String[] args) {
        List<Person> all=new ArrayList<Person>();
        all.add(new Person("张三",67));
        all.add(new Person("李四",45));
        all.add(new Person("沄沐",25));
        System.out.println(all.contains(new Person("沄沐",25)));
        all.remove(new Person("沄沐",25));
        all.forEach(System.out::println);//方法引用代替消费型接口
    }
}
