package com.itche.chapter01;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static Star createProxy(BigStar bigStar){
        return (Star) Proxy.newProxyInstance(BigStar.class.getClassLoader(), BigStar.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.equals("sing")){
                    System.out.println("准备话筒，收钱20万");
                }else if (method.equals("dance")){
                    System.out.println("准备场地，收钱1000万");
                }
                return method.invoke(bigStar,args);
            }
        });
    }
}
