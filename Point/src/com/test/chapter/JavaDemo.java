package com.test.chapter;

import com.itche.chpater03.Point;

public class JavaDemo {
    public static void main(String[] args) {
        Point <Integer>point=new Point<Integer>();//根据需求进行内容的设置
        point.setX(10);//自动装箱
        point.setY(20);
        int x=point.getX();
        int y=point.getY();
        System.out.println("x坐标："+x+"、y坐标："+y);

    }
}
