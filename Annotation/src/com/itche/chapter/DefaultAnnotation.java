package com.itche.chapter;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DefaultAnnotation {
    public String title();//获取数据
    public String url() default "www.mldn.cn";//获取数据默认值
}
