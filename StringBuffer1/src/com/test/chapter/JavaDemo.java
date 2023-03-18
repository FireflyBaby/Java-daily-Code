package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        StringBuffer buf=new StringBuffer();
        for (int x='a';x<='z';x++){//直接循环设置
            buf.append((char) x);//保存字符
        }
        buf.reverse().delete(0,5);//反转处理
        System.out.println(buf);
    }
}
