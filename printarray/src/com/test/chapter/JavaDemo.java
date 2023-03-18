package com.test.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        int data[]=initArray();//通过方法获得数组内容
        changeArray(data);
        System.out.println("总和为"+sum(data));
        System.out.println("平均值为"+avg(data));
        System.out.println("最大值为"+max(data));
        System.out.println("最小值为"+min(data));
        printArray(data);

    }
    public static int [] initArray(){
        int arr[]=new int[]{1,2,3,4,5};
        return arr;//返回一个数组
    }
    public static int [] changeArray(int num[]){
       for (int i=0;i<num.length;i++){
           num[i]*=2;
       }
       return num;
    }
    public static int sum(int num[]){
        int sum=0;
        for(int i=0;i< num.length;i++){
            sum+=num[i];
        }
        return sum;
    }
    public static double avg(int num[]){
       return sum(num)/num.length;
    }
    public static int max(int num[]){
        int max=num[0];
        for (int i=1;i<num.length;i++){
            if (num[i]>max){
                max=num[i];
            }
        }
        return max;
    }
    public static int min(int num[]){
        int min=num[0];
        for (int i=1;i<num.length;i++){
            if (num[i]<min){
                min=num[i];
            }
        }
        return min;
    }
    //要求接收一个int型的数组
    public static void printArray(int temp[]){
        for (int num:temp) {
            System.out.print(num+" ");
        }
    }
}
