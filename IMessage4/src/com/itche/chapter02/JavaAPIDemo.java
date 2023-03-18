package com.itche.chapter02;

import net.sf.cglib.proxy.Enhancer;

public class JavaAPIDemo {
    public static void main(String[] args)throws Exception {
        Message realObject=new Message();//真实主体对象
        Enhancer enhancer=new Enhancer();//负责代理操作的程序类
        enhancer.setSuperclass(realObject.getClass());//假定一个父类
        enhancer.setCallback(new MLDNProxy(realObject));//设置代理类
        Message proxyObject= (Message) enhancer.create();//创建代理对象
        proxyObject.send();
    }
}
