package com.itche.chapter13;

public class Factory {
    public static IStudentService getInstance(){
        return new StudentServiceImpl();
    }
}
