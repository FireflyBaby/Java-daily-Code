package com.test.chapter;

import com.itche.chapter03.Person;

public class JavaDemo {
    public static void main(String[] args) {
        Person per[]=new Person[3];//对象数组的动态初始化
        per[0]=new Person("李四",18);
        per[1]=new Person("朱瑞",26);
        per[2]=new Person("张三",20);
        for (int i=0;i< per.length;i++){
            System.out.println(per[i].getInfo());
        }
    }
}
