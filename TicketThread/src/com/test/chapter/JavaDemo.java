package com.test.chapter;

import com.itche.chapter03.TicketThread;

public class JavaDemo {
    public static void main(String[] args) {
        TicketThread body=new TicketThread();
        for (int x=0;x<5;x++){
            new Thread(body,"票贩子"+x).start();
        }
    }
}
