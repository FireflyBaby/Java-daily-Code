package com.itche.chapter03;

public class MathUtil {
    private MathUtil(){

    }

    /**
     *实现四舍五入操作
     * @param num 要进行四舍五入操作的数字
     * @param scale 四舍五入保留的小数位数
     * @return 四舍五入处理后的结果
     */
    public static double round(double num,int scale){
       return Math.round(Math.pow(10,scale)*num)/Math.pow(10,scale);
    }
}
