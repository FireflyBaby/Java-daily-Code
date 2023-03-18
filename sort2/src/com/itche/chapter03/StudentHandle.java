package com.itche.chapter03;

public class StudentHandle implements IHandle<Student>{
    private String content;

    public StudentHandle(String content) {
        this.content = content;
    }

    @Override
    public Student[] result() {
        String values[]=this.content.split("\\|");
        Student objects[]=new Student[values.length];//确定数组大小
        for (int x=0;x< objects.length;x++){
            String temp[]=values[x].split(":");
            objects[x]=new Student(temp[0],Integer.parseInt(temp[1]),Double.parseDouble(temp[2]));
        }
        return objects;
    }
}
