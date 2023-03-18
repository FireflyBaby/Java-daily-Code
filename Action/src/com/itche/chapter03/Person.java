package com.itche.chapter03;

public class Person extends Action{
    @Override
    public void eat() {
        System.out.println("饿的时候安静的坐下吃饭。");
    }

    @Override
    public void sleep() {
        System.out.println("安静的躺下，慢慢的睡着，而后做着美丽的春梦。");
    }

    @Override
    public void work() {
        System.out.println("人类的hi高级脑类动物，所以要有想法的工作。");
    }
}
