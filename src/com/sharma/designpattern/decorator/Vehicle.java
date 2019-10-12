package com.sharma.designpattern.decorator;

public class Vehicle {

    public void start() {
        System.out.println(this.getClass().getSimpleName() + " engine has started.");
    }

    public String description() {
       return "I am ";
    }
}
