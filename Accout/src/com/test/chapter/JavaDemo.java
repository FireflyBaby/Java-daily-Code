package com.test.chapter;

import com.ithem.chapter03.Account;

public class JavaDemo {
    public static void main(String[] args) {
        Account account=new Account("朱瑞",2000.00);
        System.out.println(account.getInfo());
        System.out.println(account.getBalance());
    }
}
