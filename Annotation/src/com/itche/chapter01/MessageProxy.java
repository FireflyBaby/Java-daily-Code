package com.itche.chapter01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MessageProxy implements InvocationHandler {
    private Object target;
    public Object bind(Object target){
        this.target=target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(),this);
    }
    public boolean connect(){
        System.out.println("【代理操作】进行消息通道的连接。");
        return true;
    }
    public void close(){
        System.out.println("【代理操作】关闭连接通道");
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        try {
            if (this.connect()) {
                return method.invoke(this.target, args);
            } else {
                throw new Exception("【error】消息无法进行发送。");
            }
        }finally {
            this.close();
        }
    }
}
