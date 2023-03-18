package com.test.chapter;

import com.itheme.chapter03.Book;

public class JavaDemo {
    public static void main(String[] args) {
        Book b1=new Book("Java",89.2);
        Book b2=new Book("Oracle",79.2);
        System.out.println(b1.getInfo());
        System.out.println(b2.getInfo());
        System.out.println("图书总册数："+Book.getCount());
    }
}
