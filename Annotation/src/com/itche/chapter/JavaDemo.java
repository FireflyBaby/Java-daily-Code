package com.itche.chapter;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        Method method = Message.class.getDeclaredMethod("send", String.class);
        DefaultAnnotation anno = method.getAnnotation(DefaultAnnotation.class);//获取指定的Annotation
        String msg= anno.title()+"("+anno.url()+")";
        method.invoke(Message.class.getDeclaredConstructor().newInstance(),msg);
    }
}
