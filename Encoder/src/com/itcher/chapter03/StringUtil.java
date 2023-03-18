package com.itcher.chapter03;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class StringUtil {
    private static final String SALT="mldn.java";
    private static final int REPEAT=5;
    /**
     * 加密处理
     * @param str 要加密的字符串，需要与盐值整合
     * @return 加密后的数据
     */
    public static String encode(String str){//加密处理
        String temp=str+"{"+SALT+"}";//盐值对外不公布
        byte data[]=temp.getBytes();//将字符串变为字节数组
        for (int x=0;x<REPEAT;x++) {
            data=Base64.getEncoder().encode(data);
        }
        return new String(data);
    }

    /**
     * 进行解密处理
     * @param str 要解密的内容
     * @return解密后的原始数据
     */
    public static String decode(String str){
        byte data[]=str.getBytes();
        for (int x=0;x<REPEAT;x++){
            data=Base64.getDecoder().decode(data);
        }
        return new String(data).replaceAll("\\{\\w+.\\w+\\}","");
    }
}
