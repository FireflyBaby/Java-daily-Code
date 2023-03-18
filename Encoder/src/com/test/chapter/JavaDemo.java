package com.test.chapter;

import com.itcher.chapter03.StringUtil;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class JavaDemo {
    public static void main(String[] args) {
        String str= StringUtil.encode("www.mldn.cn");
        System.out.println(str);
        System.out.println(StringUtil.decode(str));
    }
}
