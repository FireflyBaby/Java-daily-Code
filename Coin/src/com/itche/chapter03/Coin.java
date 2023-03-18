package com.itche.chapter03;

import java.util.Random;

public class Coin {//模拟硬币仍的操作
    private int front;//保存正面次数
    private int back;//保存背面次数
    private Random random=new Random();

    /**
     * 仍硬币的处理
     * @param num 扔硬币的执行次数
     */
    public void throwCoin(int num){
        for (int x=0;x<num;x++){
            int temp=random.nextInt(2);
            if (temp==0){
                this.front++;
            }else {
                this.back++;
            }
        }
    }
    public int getFront(){
        return this.front;
    }
    public int getBack(){
        return this.back;
    }
}
