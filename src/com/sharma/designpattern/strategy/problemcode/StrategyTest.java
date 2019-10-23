package com.sharma.designpattern.strategy.problemcode;

public class StrategyTest {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        Vehicle car = new Car();
        Vehicle raceCar = new RaceCar();
        Vehicle helicopter = new Helicopter();
        Vehicle jet = new Jet();
/*
Problem's here
1) Each subclass extends Vehicle class so they get default go() behaviour, which is good for Car
and Race car but not good for Helicopter and Jet.
2) To solve problem 1 we can override go() behaviour in the required sub classes, but doing so we
 are spreading code in each subclass.
3) In case of change in the volatile code, we have to change all the sub classes
 */

        vehicle.go();
        car.go();
        raceCar.go();
        helicopter.go();
        jet.go();
    }
}
