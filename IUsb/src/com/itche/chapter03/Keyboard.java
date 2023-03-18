package com.itche.chapter03;

public class Keyboard implements IUsb{
    @Override
    public boolean check() {
        return true;
    }

    @Override
    public void work() {
        System.out.println("开始码字任务。");
    }
}
