package com.itche.chapter03;

public class Circular implements IGraphical{
    private double radius;
    public Circular(double radius){
        this.radius=radius;
    }
    @Override
    public void paint() {
        System.out.println("以半径为“"+this.radius+"”绘制圆形。");
    }
}
