package com.itche.chapter03;

public class Sex {
    private static final Sex MALE=new Sex("男");
    private static final Sex FEMALE=new Sex("女");
    private String sex;
    private Sex(String sex){
        this.sex=sex;
    }
    public static Sex getInstance(String sex){
        switch (sex){
            case "male":return MALE;
            case "female":return FEMALE;
            default:return null;
        }
    }

    @Override
    public String toString() {
        return this.sex;
    }
}