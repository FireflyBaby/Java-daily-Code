package com.test.chapter;
public class JavaDemo {
    public static void main(String[] args) throws Exception{
        Member memberA=new Member("林强",30);
        Member memberB=(Member) memberA.clone();
        System.out.println(memberA);
        System.out.println(memberB);
    }
}
