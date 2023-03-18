package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {
       Color c=Color.RED;//获取实例化对象
       /* for (Color c:Color.values()){
            System.out.println(c);
        }
       */
        switch (c){
            case RED:
                System.out.println("红色");
                break;
            case BLUE:
                System.out.println("蓝色");
                break;
            case GREEN:
                System.out.println("绿色");
                break;
        }
    }
}
