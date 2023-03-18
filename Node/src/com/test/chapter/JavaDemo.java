package com.test.chapter;

import com.itche.chapter03.Node;

public class JavaDemo {
    public static void main(String[] args) {
        Node<String>n1=new Node<String>("火车头");
        Node<String>n2=new Node<String>("车厢一");
        Node<String>n3=new Node<String>("车厢二");
        Node<String>n4=new Node<String>("车厢三");
        Node<String>n5=new Node<String>("车厢四");
        n1.setNext(n2);
        n2.setNext(n3);
        n3.setNext(n4);
        n4.setNext(n5);
        print(n1);
    }
    public static void print(Node<?> node){
        if (node!=null){//有节点
            System.out.println(node.getData());
            print(node.getNext());//递归调用
        }

    }
}
