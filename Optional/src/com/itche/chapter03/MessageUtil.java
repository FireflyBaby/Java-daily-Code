package com.itche.chapter03;

import java.util.Optional;

public class MessageUtil {
    private MessageUtil(){}
    public static Optional<IMessage> getMessage(){
        return Optional.ofNullable(null);//有对象
    }
    public static void useMessage(IMessage msg){
        if (msg!=null) {
            System.out.println(msg.getContent());
        }
    }
}
