package com.sharma.core;

public class ClockAngleTestApplication {

    public static void main(String[] args) {

        ClockAngle clockAngle = new ClockAngle();

        int angle = clockAngle.findHourAndMinuteHandAngleForGivenTime(11, 55);

        if (angle >= 0) {
            System.out.println("Angle between Hour and Minute hand is " + angle);
        } else {
            System.out.println("Could not calculate angel.");
        }
    }
}
