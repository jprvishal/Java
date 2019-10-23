package com.sharma.designpattern.strategy.solutioncode;

import com.sharma.designpattern.strategy.solutioncode.algorithm.NormalDrive;

public class StrategyTest {

    public static void main(String[] args) {

        Vehicle vehicle = new Vehicle();
        vehicle.setDrivingStyle(new NormalDrive());
        vehicle.go();

        Vehicle raceCar = new RaceCar();
        raceCar.go();

        Vehicle helicopter = new Helicopter();
        helicopter.go();
    }
}
