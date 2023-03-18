package com.test.chapter;

import com.itche.chapter03.Computer;
import com.itche.chapter03.Keyboard;
import com.itche.chapter03.Print;

public class JavaDemo {
    public static void main(String[] args) {
        Computer computer=new Computer();
        computer.plugin(new Keyboard());
        computer.plugin(new Print());

    }
}
