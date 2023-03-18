package com.test.chapter;

import java.math.BigInteger;

public class JavaDemo {
    public static void main(String[] args) {
        BigInteger bigA=new BigInteger("42252525225");
        BigInteger bigB=new BigInteger("4242");
        BigInteger result[]=bigA.divideAndRemainder(bigB);
        System.out.println("商："+result[0]+" 余数："+result[1]);
    }
}
