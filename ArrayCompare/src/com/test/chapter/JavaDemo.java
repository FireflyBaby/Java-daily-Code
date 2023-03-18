package com.test.chapter;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        int []dateA=new int[]{1,5,7,2,3,6,0,11,13,16,19};//数组
        Arrays.sort(dateA);//数组必须采用升序排序（默认）
        System.out.println(Arrays.toString(dateA));
        for (int x=0;x< dateA.length;x++){
            System.out.println(dateA[x]+"查询结果；"+ArrayUtil.binarySearch(dateA,dateA[x]));
        }
        System.out.println(ArrayUtil.binarySearch(dateA,4));
        System.out.println(ArrayUtil.binarySearch(dateA,9));
    }
}
