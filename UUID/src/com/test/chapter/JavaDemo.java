package com.test.chapter;

import java.util.UUID;

public class JavaDemo {
    public static void main(String[] args) {
        String str="46400000-8cc0-11bd-b43e-10d46e4ef14d";
        System.out.println("UUID.fromString():"+UUID.fromString(str));
    }
}
