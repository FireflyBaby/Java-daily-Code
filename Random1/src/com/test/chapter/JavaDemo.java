package com.test.chapter;

import java.util.Arrays;
import java.util.Random;

public class JavaDemo {
    public static void main(String[] args) {
        int []data=new int[7];//开辟7个大小的空间（不能有0，不能重复）
        Random random=new Random();
        int foot=0;//操作data角标
        while (foot<7){
            int num=random.nextInt(37);
            if (isUse(num,data)){
                data[foot++]=num;
            }
        }
        java.util.Arrays.sort(data);
        for (int i=0;i<7;i++){
            System.out.print(data[i]+" ");
        }
    }

    /**
     *判断传入的数字是否为0以及是否在数组之中存在
     * @param num 要判断的数字
     * @param temp 已经存在的数据
     * @return 如果该数字不是0并且可以返回true,否则返回false
     */
    public static boolean isUse(int num,int temp[]){
        if (num==0){
            return false;
        }
        for (int x=0;x< temp.length;x++){
            if (num==temp[x]){
                return false;
            }
        }
        return true;
    }
}
