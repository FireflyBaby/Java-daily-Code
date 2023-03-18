package com.itche.chapter01;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface UseMessage {
    public Class<?> clazz();
}
