package com.itche.chapter;

import java.util.Iterator;

class Message implements Iterable<String>{
    private String[] content=new String[]{"MLDN","MLDNJava","小李老师"};
    private int foot;
    @Override
    public Iterator<String> iterator() {
        return new MessageIterator();
    }
    private class MessageIterator implements Iterator<String>{

        @Override
        public boolean hasNext() {//判断是否有内容存在
            return Message.this.foot<Message.this.content.length;
        }

        @Override
        public String next() {
            return Message.this.content[Message.this.foot++];
        }
    }


}
