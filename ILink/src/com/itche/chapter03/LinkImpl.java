package com.itche.chapter03;

public class LinkImpl<E> implements ILink<E>{
    private class Node{//保存节点的数据关系
        private E data;
        private Node next;
        public Node(E data){
            this.data=data;
        }
        //第一次调用：this=LinkImpl.root;
        //第二次调用：this=LinkImpl.root.next;
        //第三次调用：this=LinkImpl.root.next.next;
        public void addNode(Node newNode){//保存新的Node数据
            if(this.next==null){//当前节点的下一个节点为null
                this.next=newNode;
            }else{
                this.next.addNode(newNode);
            }
        }
        //第一次调用：this=LinkImpl.root
        //第二次调用：this=LinkImpl.root.next
        //第三次调用：this=LinkImpl.root.next.next
        public void toArrayNode(){
            LinkImpl.this.returnData[LinkImpl.this.foot++]=this.data;
            if (this.next!=null){//还有下一个数据
                this.next.toArrayNode();
            }
        }

        public E getNode(int index) {
            if (LinkImpl.this.foot++==index){//索引相同
                return this.data;//返回当前数据
            }else{
                return this.next.getNode(index);
            }
        }

        public void setNode(int index,E data) {
            if (LinkImpl.this.foot++==index){
                this.data=data;//修改数据
            }else{
                this.next.setNode(index,data);
            }
        }
        public boolean containsNode(E data){
            if (this.data.equals(data)){//对象比较
                return true;
            }
            else{
                if (this.next==null){//没有后续节点了
                    return false;//找不到
                }
                else
                {
                    return this.next.containsNode(data);//向后继续判断
                }
            }
        }
        public void removeNode(Node previous,E data){
            if (this.data.equals(data)){
                previous.next=this.next;//空出当前节点
            }else{
                if (this.next!=null){//有后续节点
                    this.next.removeNode(this,data);//向后继续删除
                }
            }
        }
    }
    private Node root;//保存根元素
    private int count;//保存数据个数
    private int foot;//描述的是操作数组的脚标
    private Object[] returnData;//返回的数据保存

    @Override
    public void add(E e) {
        if (e==null){
            return;
        }
        Node newNode=new Node(e);
        if (this.root==null){
            this.root=newNode;
        }else{//根节点存在
            this.root.addNode(newNode);
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
        //return this.root==null;
        return this.count==0;
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()){//空集合
            return null;//现在没有数据
        }
        this.foot=0;//脚标清0
        this.returnData=new Object[this.count];//根据已有的长度开辟数组
        this.root.toArrayNode();//利用Node类进行递归数据获取
        return this.returnData;
    }
    public E get(int index){
        if (index>=this.count){//索引应该在指定的范围之内
            return null;
        }//索引数据的获取应该由Node类完成
        this.foot=0;//重置索引下标
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E data) {
        if (index>=this.count){//索引应该在指定的范围之内
            return ;//方法结束
        }//索引数据的获取应该由Node类完成
        this.foot=0;//重置索引下标
        this.root.setNode(index,data);//修改数据
    }

    @Override
    public boolean contains(E data) {
        if (data==null){
            return false;//没有数据
        }
        return this.root.containsNode(data);//交给Node类判断
    }

    @Override
    public void remove(E data) {
        if (this.contains(data)){//判断数据是否存在
            if (this.root.data.equals(data)) {//根节点为要删除节点
                this.root = this.root.next;//根的下一个节点
            } else{
            this.root.next.removeNode(this.root,data);
            }
            this.count--;
            this.foot--;
       }
   }

    @Override
    public void clear() {
        this.root=null;//后续所有节点都没了
        this.count=0;//个数清0

    }
}
