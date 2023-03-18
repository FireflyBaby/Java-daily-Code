package com.itche.chapter03;

import com.test.chapter.Outer;

public class JavaDemo {
    public static void main(String[] args) {
        Outer outer=new Outer();//实例化外部类对象
        outer.fun();//调用外部类中的方法
    }
}
