package com.itche.chapter01;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaDemo {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list1,"蔡坤坤,24","张三,31","李四,23","王小五,32","安静,34","小小明,54");
        Collections.addAll(list2,"杨蔡坤,24","张三,31","杨李四,23","王五,32","小静,34","杨杨明,54");
        Stream<String> stream1 = list1.stream().filter(s -> s.split(",")[0].length() == 3).limit(2);
        System.out.println("----------------------");
        Stream<String> stream2 = list2.stream().filter(s -> s.split(",")[0].startsWith("杨")).skip(1);
        List<Actor> list = Stream.concat(stream1, stream2).map(actor -> new Actor(actor.split(",")[0], Integer.parseInt(actor.split(",")[1])))
                .collect(Collectors.toList());
        System.out.println(list);

    }
}
