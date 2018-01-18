package com.example.javatest;

/**
 * Adapter
 * Created by My on 2018/1/18.
 */

public class Adapter implements PowerA {
    private PowerB powerB;

    public Adapter(PowerB powerB) {
        this.powerB = powerB;
    }

    @Override
    public void insert() {
        this.powerB.connect();
    }
}
