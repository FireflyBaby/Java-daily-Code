package com.test.chapter;

import com.itche.chapter03.ChannelImpl;
import com.itche.chapter03.IChannel;

public class JavaDemo {
    public static void main(String[] args) {
        IChannel channel=new ChannelImpl();
        channel.send(((ChannelImpl)channel).new MessageImpl());
    }
}
