package com.itche.chapter03;

public class Triangle implements IGraphical{//绘制三角形
    private Point[]x;
    private Point[]y;
    private Point[]z;
    public Triangle(Point[] x,Point[] y,Point[] z){
        this.x=x;
        this.y=y;
        this.z=z;
    }
    @Override
    public void paint() {
        System.out.println("绘制第一条边，开始坐标：["+this.x[0].getX()+","+this.x[0].getY()+
                "]，结束坐标：["+this.x[1].getX()+","+this.x[1].getY()+"]");
        System.out.println("绘制第二条边，开始坐标：["+this.y[0].getX()+","+this.y[0].getY()+
                "]，结束坐标：["+this.y[1].getX()+","+this.y[1].getY()+"]");
        System.out.println("绘制第三条边，开始坐标：["+this.z[0].getX()+","+this.z[0].getY()+
                "]，结束坐标：["+this.z[1].getX()+","+this.z[1].getY()+"]");
    }
}
