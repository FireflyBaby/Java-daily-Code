package com.itche.chapter03;

public class Robot extends Action{
    @Override
    public void eat() {
        System.out.println("机器人需要接通电源充电。");
    }

    @Override
    public void sleep() {

    }

    @Override
    public void work() {
        System.out.println("机器人按照固定的套路工作。");
    }
}
