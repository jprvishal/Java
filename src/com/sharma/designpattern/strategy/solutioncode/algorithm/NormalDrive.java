package com.sharma.designpattern.strategy.solutioncode.algorithm;

public class NormalDrive implements DrivingStyle {

    @Override
    public void go() {
        System.out.println("Driving at normal speed!");
    }
}
