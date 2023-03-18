package com.itche.chapter03;

public interface UserService {
    public void login(String loginName,String passWord) throws Exception;//登录功能
    public void deleteUser() throws Exception;//删除用户
    public String[] selectUsers() throws Exception;//查询用户，返回数组的形式
}
