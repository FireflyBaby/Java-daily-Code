package com.itche.chapter15;

public class UserServiceProxy implements IUserService{
    private IUserService userService;
    public UserServiceProxy(IUserService userService) {
        this.userService = userService;
    }
    @Override
    public boolean isExit() {
        return this.userService.isExit();
    }
    @Override
    public boolean login(String name, String password) {
        while (!this.isExit()) {
            String inputData = InputUtil.getString("请输入登录信息：");
            if (inputData.contains("/")) {//输入了用户名和密码
                String[] result = inputData.split("/");
                if (this.userService.login(result[0], result[1])) {//登录认证
                    return true;//循环结束
                } else {
                    System.out.println("登录失败！错误的用户名或密码~");
                }
            }else {//现在只有用户名了
                String pwd=InputUtil.getString("请输入密码：");
                if (this.userService.login(inputData, pwd)){//登录认证
                    return true;//循环结束
                }else {
                    System.out.println("登录失败！错误的用户名或密码~");
                }
            }

        }
        return false;
    }
}
