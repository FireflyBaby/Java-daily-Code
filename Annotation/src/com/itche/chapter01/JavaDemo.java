package com.itche.chapter01;

public class JavaDemo {
    public static void main(String[] args) throws Exception {
        MessageService messageService = new MessageService();
        messageService.send("www.mldn.cn");
    }
}
