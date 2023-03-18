package com.test.chapter;

import com.itche.chapter03.ILink;
import com.itche.chapter03.LinkImpl;

public class JavaDemo {
    public static void main(String[] args) {
        ILink<String>all=new LinkImpl<String>();
        System.out.println("【增加之前】"+all.size()+",是否为空集合"+all.isEmpty());
        all.add("Hello");
        all.add("World");
        all.add("MLDN");
        all.set(1,"世界");
        all.remove("世界");
        all.clear();
        System.out.println("【增加之后】"+all.size()+",是否为空集合"+all.isEmpty());
        Object result[]= all.toArray();
        if (result!=null){
          for (Object obj:result){
             System.out.println(obj);
          }
        }
        System.out.println("--------数据获取的分割线--------------");
        System.out.println(all.get(0));
        System.out.println(all.get(1));
        System.out.println(all.get(4));
        System.out.println("----------数据判断的分割线------------------");
        System.out.println(all.contains("MLDN"));
    }
}
