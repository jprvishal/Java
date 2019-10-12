package com.sharma.designpattern.decorator;

public class Helicopter extends Vehicle {

    @Override
    public String description() {
        return super.description() + " flying " + this.getClass().getSimpleName();
    }

}
