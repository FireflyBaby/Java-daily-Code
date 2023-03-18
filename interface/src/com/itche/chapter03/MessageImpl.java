package com.itche.chapter03;

public class MessageImpl extends DatabaseAbstract implements IMessage,IChannel{
    @Override
    public String getInfo() {
        if (this.connect()){
            if (this.getDatabaseConnect()){
                return "数据库中得到一个消息，有人胖了。";
            }else{
                return "数据库消息无法访问。";
            }
        }
        return "通道创建失败，无法获取消息。";
    }

    @Override
    public boolean connect() {
        System.out.println("消息发送通道已经成功建立。");
        return true;
    }

    @Override
    public boolean getDatabaseConnect() {
        return true;
    }
}
