package com.example.javatest;

/**
 * PowerBImpl
 * Created by My on 2018/1/18.
 */

public class PowerBImpl implements PowerB {
    @Override
    public void connect() {
        System.out.println("正在连接...");
        System.out.println("电源B开始工作了");
        System.out.println("工作结束");
    }
}
