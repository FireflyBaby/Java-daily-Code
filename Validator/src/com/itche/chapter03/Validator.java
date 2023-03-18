package com.itche.chapter03;

public class Validator {//定义一个专门的验证程序类
    private Validator(){}
    public static boolean isEmail(String email){
        if (email==null||"".equals(email)){//数据为空
            return false;
        }
        String regex="[a-zA-Z0-9]\\w+@\\w+\\.\\w+";
        return email.matches(regex);
    }
}
