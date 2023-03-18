package com.itche.chapter03;

public class BinaryTreeImpl<T> implements IBinaryTree<T>{
    private class Node{
        private Comparable<T> data;//存储数据
        private Node left;//左节点
        private Node right;//右节点
        private Node parent;//父节点
        public Node(Comparable<T>data){
            this.data=data;
        }
        public void addNode(Node newNode){
            if (this.data.compareTo((T) newNode.data)<=0){//当前节点小于传进来的节点
                if (this.right==null){//右节点为空
                    this.right=newNode;
                }else{
                    this.right.addNode(newNode);
                }
            }else{
                if (this.left==null) {
                    this.left=newNode;
                }else{
                    this.left.addNode(newNode);
                }
            }
        }
        public void toArrayNode(){//中序遍历
            if (this.left!=null){
                this.left.toArrayNode();
            }
            BinaryTreeImpl.this.returnData[BinaryTreeImpl.this.foot++]=(T)this.data;//获取数据
            if (this.right!=null){
                this.right.toArrayNode();
            }
        }

    }
    //-------------------------------------------------------------------
    private Node root;//保存根节点
    private int size;//保存元素的个数
    private Object[] returnData;
    private int foot;//作为操作的脚标
    @Override
    public void add(T data) {
        if (data==null){
            throw new NullPointerException("保存的数据不为空！");
        }
        Comparable obj=(Comparable) data;//强制转换，如果有未实现接口会产生异常
        Node newNode=new Node(obj);//定义节点对象
        if (this.root==null){//当前没有根节点
            this.root=newNode;//第一个节点作为根节点
        }else{
            this.root.addNode(newNode);
        }
        this.size++;//个数增加
    }

    @Override
    public int size() {
        return this.size;
    }

    @Override
    public Object[] toArray() {
        if (this.size==0){
            return null;
        }
        this.foot=0;//脚标清零
        this.returnData=new Object[this.size];
        this.root.toArrayNode();
        return returnData;
    }
}
