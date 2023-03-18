package com.itche.chapter;

public class JavaDemo {
    public static void main(String[] args) {
        Message message=new Message();
        for (String msg : message) {
            System.out.print(msg+"、");
        }
    }
}
