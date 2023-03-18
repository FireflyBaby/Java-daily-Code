package com.itheme.chapter03;

public class User {
    private String uid;
    private String password;
    private static int count=0;
    public User(){
        this("NO ID","mldnjava");
    }
    public User(String uid){
        this(uid,"mldnjava");
    }
    public User(String uid,String password){
        this.uid=uid;
        this.password=password;
        count++;
    }
    public static void setCount(){
        count=1;
    }

    public void setUid(String uid) {
        this.uid = uid;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUid() {
        return this.uid;
    }

    public String getPassword() {
        return this.password;
    }
    public String getInfo(){
        return "用户名："+this.uid+"、密码："+this.password;
    }

    public static int getCount() {
        return count;  //获取用户个数
    }
}
