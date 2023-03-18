package com.test.chapter;

import com.itche.chapter03.arrayUtil;

public class JavaDemo {
    public static void main(String[] args) {
        int arrA[]=new int[]{1,2,3,4,5,6,7,8,9};
        int arrB[]=new int[]{11,22,33,44,55,66,77,88,99};
        arrayUtil.arraycopy(arrA,5,arrB,3,3);
        //System.arraycopy(arrA,5,arrB,3,3);
        arrayUtil.printArray(arrB);
    }
}
