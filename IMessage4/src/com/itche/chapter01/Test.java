package com.itche.chapter01;

public class Test {
    public static void main(String[] args) {
        BigStar star = new BigStar("杨超越");
        Star starProxy = ProxyUtil.createProxy(star);
        System.out.println(new String(starProxy.sing("好日子")));
        starProxy.dance();

    }
}
