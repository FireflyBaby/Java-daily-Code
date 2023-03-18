package com.itche.chapter03;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws Exception {
        UserService userService = ProxyUtil.createProxy(new UserServiceImpl());
        userService.login("admin","123456");
        System.out.println("------------------------");
        userService.deleteUser();
        System.out.println("------------------------");
        System.out.println("查询到的用户是："+ Arrays.toString(userService.selectUsers()));
    }
}
