package com.test.chapter;

import com.itche.chapter03.Int;

public class JavaDemo {
    public static void main(String[] args) {
        Object obj=new Int(10);//装箱：将基本数据类型保存在包装类之中
        int x=((Int)obj).intValue();//拆箱：从包装类对象中获取基本数据类型
        System.out.println(x*2);
    }
}
