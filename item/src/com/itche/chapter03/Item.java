package com.itche.chapter03;

public class Item {
    private long iid;
    private String title;
    private subItem[] subItems;
    public Item(long iid,String title){
        this.iid=iid;
        this.title=title;
    }

    public void setIid(long iid) {
        this.iid = iid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setSubItems(subItem[] subItems) {
        this.subItems = subItems;
    }

    public long getIid() {
        return this.iid;
    }

    public String getTitle() {
        return this.title;
    }

    public subItem[] getSubItems() {
        return this.subItems;
    }

    public String getInfo(){
        return "【分类信息】iid="+this.iid+"、title="+this.title;
    }
}
