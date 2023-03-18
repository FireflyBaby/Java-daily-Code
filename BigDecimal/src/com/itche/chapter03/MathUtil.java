package com.itche.chapter03;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class MathUtil {
    private MathUtil(){}
    public static double round(double num,int scale){
        return new BigDecimal(num).divide(new BigDecimal(1.0),scale, RoundingMode.HALF_UP).doubleValue();
        }
}
