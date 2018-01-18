package com.example.javatest;

/**
 * 适配器模式（ Adapter ）：将一个类的接口转换成客户希望的另外一个接口。
 * 适配器模式使得原本由于接口不兼容而不能一起工作的那些类可以一起工作。
 * OO设计原则：
 * 1、面向接口编程（面向抽象编程）
 * 2、封装变化
 * 3、多用组合，少用继承
 * 4、对修改关闭，对扩展开放
 */
public class Test {

    public static void main(String[] args) {

        work(new PowerAImpl());

        work(new Adapter(new PowerBImpl()));


    }

    public static void work(PowerA a) {
        a.insert();
    }


}
