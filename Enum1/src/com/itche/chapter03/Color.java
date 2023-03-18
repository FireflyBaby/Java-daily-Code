package com.itche.chapter03;

public enum Color implements IMessage{
    RED("红色"),GREEN("绿色"),BLUE("蓝色");//枚举对象要写在首行
    private String title;//定义属性
    private Color(String title){
        this.title=title;
    }


    @Override
    public String toString() {
        return "Color{" +
                "title='" + this.title + '\'' +
                '}';
    }

    @Override
    public String getMessage() {
        return this.title;
    }
}
