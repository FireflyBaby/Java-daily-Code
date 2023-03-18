package com.itche.chapter06;

public class JavaDemo {
    public static void main(String[] args) {
        Box<Number> box1 = new Box<>();
        box1.setFirst(100);
        Box<Integer> box2=new Box<>();
        box2.setFirst(200);
        showBox(box2);
        showBox(box1);
    }
    public static void showBox(Box<? extends Number> box){//类型通配符
        Number first = box.getFirst();
        System.out.println(first);
    }

}
