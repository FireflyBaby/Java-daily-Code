package com.itche.chapter;

import java.lang.reflect.Method;

public interface InvocationHandler {
    /**
     *代理方法调用，代理主题类里面执行的方法最终都是此方法
     * @param proxy 要代理的对象
     * @param method 要执行的接口方法名称
     * @param args 传递的参数
     * @return 某一个方法的返回值
     * @throws Throwable 方法调用时出现的错误继续向上抛出
     */
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable;
}

