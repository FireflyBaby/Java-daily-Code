package com.itche.chapter03;

public class ChannelImpl implements IChannel{
    @Override
    public void send() {
        AbstractMessage msg=new MessageImpl();
        System.out.println(msg.getcontent());
    }
    class MessageImpl extends AbstractMessage{
        @Override
        public String getcontent() {
            return "www.mldn.cn";
        }
    }
}
