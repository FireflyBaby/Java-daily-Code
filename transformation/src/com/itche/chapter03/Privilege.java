package com.itche.chapter03;

public class Privilege {
    private long pid;
    private String title;
    private Role roles;
    public Privilege(long pid,String title){
        this.pid=pid;
        this.title=title;
    }

    public void setPid(long pid) {
        this.pid = pid;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public long getPid() {
        return this.pid;
    }

    public String getTitle() {
        return this.title;
    }

    public Role getRoles() {
        return this.roles;
    }

    public String getInfo(){
        return "【权限信息】pid="+this.pid+"、title="+this.title;
    }
}
