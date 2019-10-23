package com.sharma.designpattern.strategy.solutioncode;

import com.sharma.designpattern.strategy.solutioncode.algorithm.FastDrive;

public class RaceCar extends Vehicle {

    public RaceCar() {
        setDrivingStyle(new FastDrive());
    }

}
