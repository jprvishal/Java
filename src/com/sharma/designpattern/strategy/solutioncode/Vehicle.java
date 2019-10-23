package com.sharma.designpattern.strategy.solutioncode;

import com.sharma.designpattern.strategy.solutioncode.algorithm.DrivingStyle;

public class Vehicle {

    protected DrivingStyle drivingStyle;

    public Vehicle() {

    }

    public void setDrivingStyle(DrivingStyle style) {
        this.drivingStyle = style;
    }

    public void go() {
        if (drivingStyle == null) {
            System.out.println("Please add driving style");
            return;
        }

        drivingStyle.go();
    }
}
