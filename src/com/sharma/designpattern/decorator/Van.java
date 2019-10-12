package com.sharma.designpattern.decorator;

public class Van extends Vehicle {

 @Override
 public String description() {
    return super.description() + "driving a " + this.getClass().getSimpleName();
 }
}
