package com.itche.chapter04;

import java.util.ArrayList;

public class JavaDemo {
    public static void main(String[] args) {
        ProductGetter<String> stringProductGetter = new ProductGetter();
        String[] strProducts={"笔记本","手机","摄像机","水杯"};
        for (int x=0;x<strProducts.length;x++){
            stringProductGetter.addProduct(strProducts[x]);
        }
        System.out.println(stringProductGetter.getProduct());
        System.out.println("-------------------");
        ProductGetter<Integer> integerProductGetter=new ProductGetter<>();
//        Integer[] integers=new Integer[]{100,213,34,565,242,2,24,45};
//        for (int x=0;x<integers.length;x++){
//            integerProductGetter.addProduct(integers[x]);
//        }
//        System.out.println(integerProductGetter.getProduct());
        ArrayList<String> stringList=new ArrayList<>();
        stringList.add("笔记本电脑");
        stringList.add("苹果手机");
        stringList.add("扫地机器人");
        String product1 = integerProductGetter.getProduct(stringList);
        System.out.println(product1+"\t"+product1.getClass().getSimpleName());
        System.out.println("-------------------");
        ProductGetter.printType("沄沐",100,true);//调用多个泛型类型的静态泛型方法
        System.out.println("-------------------");
        ProductGetter.print(1,2,3,"沄沐",true,false,'r');//可变参数的泛型方法的调用
    }
}
