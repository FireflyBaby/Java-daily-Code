package com.itche.chapter03;

public class Role {
    private long rid;
    private String title;
    private Menber menbers[];
    private Privilege privileges[];
    public Role(long rid, String title){
        this.rid=rid;
        this.title=title;
    }

    public void setRid(long rid) {
        this.rid = rid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMenbers(Menber[] menbers) {
        this.menbers = menbers;
    }

    public void setPrivileges(Privilege[] privileges) {
        this.privileges = privileges;
    }

    public long getRid() {
        return this.rid;
    }

    public String getTitle() {
        return this.title;
    }

    public Menber[] getMenbers() {
        return this.menbers;
    }

    public Privilege[] getPrivileges() {
        return this.privileges;
    }

    public String getInfo(){
        return "【角色信息】rid="+this.rid + "、title=" + this.title;
    }


}
