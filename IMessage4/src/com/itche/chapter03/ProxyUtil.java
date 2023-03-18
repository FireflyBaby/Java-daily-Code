package com.itche.chapter03;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyUtil {
    public static UserService createProxy(UserService userService){
        return (UserService) Proxy.newProxyInstance(UserServiceImpl.class.getClassLoader(), UserServiceImpl.class.getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                if (method.getName().equals("login")||method.getName().equals("deleteUser")||method.getName().equals("selectUsers")){
                    long start=System.currentTimeMillis();
                    Object rs=method.invoke(userService,args);
                    long end=System.currentTimeMillis();
                    System.out.println(method.getName()+"方法执行耗时："+(end=start)/1000.0+"s");
                    return rs;
                }else {
                return method.invoke(userService,args);
                }
            }
        });
    }
}
