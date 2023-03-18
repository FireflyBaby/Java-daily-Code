package com.test.chapter;

import com.itche.chapter03.IChannel;

import java.nio.channels.Channel;

public class JavaDemo {
    public static void main(String[] args) {
        IChannel channel= IChannel.getInstance();
        channel.send();
    }
}
