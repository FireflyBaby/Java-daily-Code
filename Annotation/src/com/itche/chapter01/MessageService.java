package com.itche.chapter01;

@UseMessage(clazz = NetMessageImpl.class)
public class MessageService {
    private IMessage message;
    public MessageService(){
        UseMessage use = MessageService.class.getAnnotation(UseMessage.class);
        this.message= (IMessage) Factory.getInstance(use.clazz());
    }
    public void send(String msg){
        this.message.send(msg);
    }
}
