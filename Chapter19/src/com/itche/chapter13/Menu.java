package com.itche.chapter13;

import com.itche.chapter12.IStringService;
import com.itche.chapter12.InputUtil;

import java.util.Arrays;

public class Menu {
    private IStringService stringService;
    public Menu(){
        this.choose();
    }
    public void choose(){
        this.show();
        String choose= InputUtil.getString("请进行选择：");
        switch (choose){
            case "1":{//接收输入数据
                String str= InputUtil.getString("请输入要追加的数据：");
                IStudentService studentService= Factory.getInstance();
                studentService.append(str);
                choose();
            }
            case "2":{//显示数据
                IStudentService studentService= Factory.getInstance();
                System.out.println(Arrays.toString(studentService.getData()));
                choose();//重复出现
            }
            case "0":{
                System.out.println("下次再见，拜拜！");
                System.exit(1);
            } default:{
                System.out.println("您输入了非法的选项，无法进行处理，请确认后再次执行程序！");
                choose();
            }
        }
    }
    public void show(){
        System.out.println("【1】追加数据\n");
        System.out.println("【2】显示所有学生数据\n");
        System.out.println("【0】结束程序执行");
        System.out.println("\n\n\n");
    }
}
