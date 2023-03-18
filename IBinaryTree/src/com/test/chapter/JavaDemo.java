package com.test.chapter;

import com.itche.chapter03.BinaryTreeImpl;
import com.itche.chapter03.IBinaryTree;
import com.itche.chapter03.Person;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        IBinaryTree bt=new BinaryTreeImpl();
        bt.add(new Person("张三",10));
        bt.add(new Person("李四",11));
        bt.add(new Person("王五",9));
        bt.add(new Person("赵六",12));
        bt.add(new Person("孙七",12));
        Object[]result=bt.toArray();
        System.out.println(Arrays.toString(result));
    }
}
