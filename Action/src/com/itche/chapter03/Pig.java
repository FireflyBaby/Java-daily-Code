package com.itche.chapter03;

public class Pig extends Action{
    @Override
    public void eat() {
        System.out.println("吃石槽中的人类剩饭。");
    }

    @Override
    public void sleep() {
        System.out.println("倒地就睡。");
    }

    @Override
    public void work() {

    }
}
