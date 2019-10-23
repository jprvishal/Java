package com.sharma.designpattern.strategy.solutioncode.algorithm;

public class FastDrive implements DrivingStyle {
    @Override
    public void go() {
        System.out.println("Driving at fast speed!");
    }
}
