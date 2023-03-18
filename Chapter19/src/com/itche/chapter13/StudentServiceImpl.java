package com.itche.chapter13;

import java.io.File;
import java.util.Arrays;

public class StudentServiceImpl implements IStudentService{
    private static final File SAVE_FILE=new File("d:"+File.separator+"student.txt");
    private String content;
    private Student[] students;
    public StudentServiceImpl() {
        this.content = FileUtil.load(SAVE_FILE);
        this.handle();
    }
    public void handle(){//进行字符串数据的处理操作
        if (this.content==null||"".equals(this.content)){
            return;//没有数据可以处理
        }
        String results[]=this.content.split("\\|");//拆分数据
        this.students=new Student[results.length];
        for (int x=0;x<this.students.length;x++){
            String[] temp=results[x].split(":");
            this.students[x]=new Student(temp[0],Double.parseDouble(temp[1]));
        }
    }
    @Override
    public void append(String str) {
        if (str.startsWith("|")){
            str.substring(1);//截取后面的部分
        }
        if (!str.endsWith("|")){
            str=str+"|";//与后面的数据进行分割
        }
        FileUtil.append(SAVE_FILE,str);
    }
    @Override
    public Student[] getData() {
        Arrays.sort(this.students);
        return this.students;
    }
}
