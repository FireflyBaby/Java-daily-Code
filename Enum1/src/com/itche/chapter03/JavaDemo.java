package com.itche.chapter03;

public class JavaDemo {
    public static void main(String[] args) {

        for (Color c:Color.values()){
            System.out.println(c.ordinal()+"-"+c.name()+c);
        }
        IMessage msg=Color.RED;
        System.out.println(msg.getMessage());
    }
}
