package com.itche.chapter03;

public class Computer {
    public void plugin(IUsb usb){
        if (usb.check()){
            usb.work();
        }
        else {
            System.out.println("硬件设备安装出现了问题，无法使用。");
        }
    }
}
