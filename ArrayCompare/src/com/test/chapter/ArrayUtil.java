package com.test.chapter;

public class ArrayUtil {
    private ArrayUtil(){}
    /**
     * 进行数组数据的二分查找操作
     * @param data 要进行查找的数组
     * @param key 要查找的数据
     * @return 如果找到数据返回数据索引，找不到返回负数
     */
    public static int binarySearch(int data[],int key){
        if (data!=null){
            return binarySearchDefault(data,0, data.length,key);
        }else{
            return -1;
        }
    }
    public static int binarySearchDefault(int[]data,int fromIndex,int toIndex,int key){
        int low=fromIndex;//左边的索引
        int high=toIndex-1;//右边的索引
        while (low<=high){//结束条件
            int middle=(low+high)>>>1;//计算中间的索引数据
            if (data[middle]==key){//查找到了
                return middle;//返回索引
            }else if (key<data[middle]){//向左边开始查
                high=middle-1;
            }else{
                low=middle+1;
            }
        }
        return -1;//未查到
    }
}
