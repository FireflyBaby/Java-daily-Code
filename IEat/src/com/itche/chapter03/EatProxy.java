package com.itche.chapter03;

public class EatProxy implements IEat{//服务代理
    private IEat eat;
    public EatProxy(IEat eat){//一定要有一个代理项
        this.eat=eat;
    }
    public void prepare(){
        System.out.println("【代理主题】1、精心购买食材");
        System.out.println("【代理主题】2、小心的处理食材");
    }
    public void clear(){
        System.out.println("【代理主题】3、收拾碗筷。");
    }
    @Override
    public void get() {
        this.prepare();
        this.eat.get();
        this.clear();
    }
}
