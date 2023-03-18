package com.test.chapter;

import com.itche.chapter03.Manager;
import com.itche.chapter03.Staff;

public class JavaDemo {
    public static void main(String[] args) {
        Manager man=new Manager("张三",38,"女","主管",150000.00);
        Staff staff=new Staff("李四",18,"男","出纳",3000.00);
        System.out.println(man.getInfo());
        System.out.println(staff.getInfo());
    }
}
