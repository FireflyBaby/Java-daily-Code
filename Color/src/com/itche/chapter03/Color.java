package com.itche.chapter03;
public class Color {//定义描述颜色的类
    private static final Color RED=new Color("红色");
    private static final Color GREEN=new Color("绿色");
    private static final Color BLUE=new Color("蓝色");
    private String title;
    private Color(String title){//构造方法私有化
        this.title=title;
    }
    public static Color getInstance(String color){
        switch (color){
            case "red":return RED;
            case "green":return GREEN;
            case "blue":return BLUE;
            default:return null;
        }
    }

    @Override
    public String toString() {
        return "Color{" +
                "title='" + this.title + '\'' +
                '}';
    }
}
