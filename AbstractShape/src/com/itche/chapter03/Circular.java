package com.itche.chapter03;

public class Circular extends AbstractShape{
    private double radius;
    public Circular(double radius) {
        this.radius=radius;
    }
    @Override
    public double area() {
        return Math.pow(this.radius,2)*3.1415926;
    }

    @Override
    public double perimeter() {
        return 2*3.1415926*this.radius;
    }
}
