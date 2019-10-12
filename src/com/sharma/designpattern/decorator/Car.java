package com.sharma.designpattern.decorator;

public class Car {

    private Vehicle vehicle;

    Car(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        vehicle.start();
    }

    public void description() {
        System.out.println(vehicle.description() + "driving " + this.getClass().getSimpleName());
    }

}
