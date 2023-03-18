package com.itche.chapter03;

public class ReverseArray extends Array{

    public ReverseArray(int len) {
        super(len);
    }
    public int[] getBefore(){
        return super.getData();
    }
    public int[] getData(){//获得排序结果
        int center=super.getData().length/2;
        int head=0;
        int tail=super.getData().length-1;
        for (int i=0;i<center;i++){
            int temp=super.getData()[head];
            super.getData()[head]=super.getData()[tail];
            super.getData()[tail]=temp;
            head++;
            tail--;
        }
        return super.getData();
    }
}
