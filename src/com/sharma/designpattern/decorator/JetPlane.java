package com.sharma.designpattern.decorator;

public class JetPlane extends Vehicle {

    public String description() {
        return super.description() + "flying fast " + this.getClass().getSimpleName();
    }
}
