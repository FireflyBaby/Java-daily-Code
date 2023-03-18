package com.itche.chapter10;

public interface INumberService {
    /**
     *输入数字，并返回输入数字的最大值和最小值
     * @param count 表示输入数字的个数
     * @return 包含有两个内容，第一个是最大值，第二个是最小值
     */
    public int[] stat(int count);
}
