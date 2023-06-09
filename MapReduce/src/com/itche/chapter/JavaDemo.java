package com.itche.chapter;

import java.util.ArrayList;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;

public class JavaDemo {
    public static void main(String[] args) {
        List<Order> all = new ArrayList<Order>();
        all.add(new Order("小强娃娃",9.9,10));
        all.add(new Order("林弱充气娃娃",32139.9,3));
        all.add(new Order("不强牌笔记本电脑",8242.9,8));
        all.add(new Order("弱强茶杯",2.9,800));
        all.add(new Order("阿强牌煎饼",0.9,138));
        //分析购买商品之中带有”强“的信息数据，并且进行商品单价和数量的处理，随后分析汇总
        DoubleSummaryStatistics stat = all.stream().filter((ele) -> ele.getName().contains("强"))
                .mapToDouble((orderObject) -> orderObject.getPrice() * orderObject.getAmount()).summaryStatistics();
        System.out.println("购买数量："+stat.getCount());
        System.out.println("购买总价："+stat.getSum());
        System.out.println("平均花费："+stat.getAverage());
        System.out.println("最高花费："+stat.getMax());
        System.out.println("最低花费："+stat.getMin());
    }
}
