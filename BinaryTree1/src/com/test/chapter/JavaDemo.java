package com.test.chapter;

import com.itche.chapter03.MapBinaryTree;
import com.itche.chapter03.Person;

import java.util.Arrays;

public class JavaDemo {
    public static void main(String[] args) {
        MapBinaryTree<Integer,Person> tree= new MapBinaryTree<Integer, Person>();
        tree.add(80,new Person("小强-80",80));
        tree.add(30,new Person("小强-30",30));
        tree.add(50,new Person("小强-50",50));
        tree.add(60,new Person("小强-60",60));
        tree.add(90,new Person("小强-90",90));
        System.out.println(tree.contains(40));
        System.out.println(tree.get(90));
       /** Object[]results=tree.toArray();
        for (Object obj:results){
            MapBinaryTree.Entry<Integer,Person>entry=( MapBinaryTree.Entry<Integer,Person>)obj;
            System.out.println(entry.getKey()+"---"+entry.getValue());
        }**/

    }
}
