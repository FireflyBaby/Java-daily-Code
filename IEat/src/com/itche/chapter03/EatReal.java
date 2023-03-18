package com.itche.chapter03;

public class EatReal implements IEat{
    @Override
    public void get() {
        System.out.println("【真实主题】得到一份食物，而后开始品尝美味。");
    }
}
