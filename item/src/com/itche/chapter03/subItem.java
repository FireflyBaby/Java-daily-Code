package com.itche.chapter03;

public class subItem {
    private long sid;
    private String title;
    private Item item;
    public subItem(long sid,String title){
        this.sid=sid;
        this.title=title;
    }

    public void setSid(long sid) {
        this.sid = sid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public long getSid() {
        return this.sid;
    }

    public String getTitle() {
        return this.title;
    }

    public Item getItem() {
        return this.item;
    }

    public String getInfo(){
        return "【子分类信息】sid="+this.sid+"、title="+this.title;
    }
}
