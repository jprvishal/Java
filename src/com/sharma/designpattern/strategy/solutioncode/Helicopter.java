package com.sharma.designpattern.strategy.solutioncode;

import com.sharma.designpattern.strategy.solutioncode.algorithm.NormalFly;

public class Helicopter extends Vehicle {

    public Helicopter() {
        setDrivingStyle(new NormalFly());
    }

}
