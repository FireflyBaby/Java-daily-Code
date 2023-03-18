package com.test.chapter;

import com.itche.chapter03.Validator;

public class JavaDemo {
    public static void main(String[] args) {
        if (args.length!=1){
            System.out.println("程序执行错误，没有输入初始化参数，正确格式为：java JavaAPIDemo Email地址");
            System.exit(1);//系统推出
        }
        String email=args[0];//获取初始化参数
        if (Validator.isEmail(email)){
            System.out.println("输入的Email地址正确！");
        }else {
            System.out.println("输入的Email地址错误！");
        }
    }
}
