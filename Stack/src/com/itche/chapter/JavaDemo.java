package com.itche.chapter;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaDemo {
    public static void main(String[] args) throws IOException {
        List<String> all = new ArrayList<>();
        Collections.addAll(all,"Java","JavaScript","JSP","Json","Python","Ruby","Go");
        Stream<String> stream = all.stream();
        List<String> result = stream.filter((ele) -> ele.toLowerCase().contains("j")).skip(2).limit(2).collect(Collectors.toList());
        System.out.println(result);
    }
}
