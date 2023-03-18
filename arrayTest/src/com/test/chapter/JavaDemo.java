package com.test.chapter;

import com.itche.chapter03.UnitArray;

public class JavaDemo {
    public static void main(String[] args) {
        int arr[]=new int[]{32,424,52,52,24,244,44};
        UnitArray unit=new UnitArray(arr);
        System.out.println("数组和为"+unit.getSum());
        System.out.println("数组平均值为"+unit.getAvg());
        System.out.println("数组最大值为"+unit.getMax());
        System.out.println("数组最小值为"+unit.getMin());
        unit.printArray(arr);
    }
}
