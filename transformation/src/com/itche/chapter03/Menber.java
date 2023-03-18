package com.itche.chapter03;

public class Menber {
    private String mid;
    private String name;
    private Role roles[];
    public Menber(String mid,String name){
        this.mid=mid;
        this.name=name;

    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoles(Role[] roles) {
        this.roles = roles;
    }

    public String getMid() {
        return this.mid;
    }

    public String getName() {
        return this.name;
    }

    public Role[] getRoles() {
        return this.roles;
    }

    public String getInfo(){
        return "【用户信息】mid="+this.mid+"、name="+this.name;
    }
}
