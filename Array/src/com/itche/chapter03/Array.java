package com.itche.chapter03;

public class Array {//数组的操作类
    private int []data;//整型数组
    private int foot=0;//进行数组索引控制
    public Array(int len){
        if (len>0){
            this.data=new int[len];
        }
        else{
            this.data=new int[1];//开辟一个空间
        }
    }
    //实现数组的容量扩充，给出的是扩充大小，实际大小是：已有大小+扩充大小
    public void increment(int num){
        int newData[]=new int[this.data.length+num];
        System.arraycopy(this.data,0,newData,0,this.data.length);
        this.data=newData;//改变数组引用
    }
    public boolean add(int num){//数据增加
        if(this.foot<this.data.length){//有位置
            this.data[this.foot++]=num;
            return true;

        }
        return false;
    }
    public int[] getData(){
        return this.data;
    }

}
