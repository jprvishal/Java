package com.sharma.core;

public class ClockAngle {
    public static final int TOTAL_DEGREES_IN_CLOCK = 360;

    public int findHourAndMinuteHandAngleForGivenTime(int hours, int minutes) {

        int hourAngle = findHourAngleForGivenHour(hours);
        int minuteAngle = findMinuteAngleForGiveMinutes(minutes);

        if (hourAngle == -1 || minuteAngle == -1) {
            return -1;
        }

        return hourAngle > minuteAngle ? (hourAngle - minuteAngle) : (minuteAngle - hourAngle);
    }

    private int findHourAngleForGivenHour(int hours) {
        //Clock has total 360 degree angle
        //In a day there are 12 hours
        //so find degrees in 1 hour
        //Multiple degreeInHour with given hours to find the
        //degrees in given hour
        if (hours < 0 && hours > 12) {
            return -1;
        }

        int degreesInHour = TOTAL_DEGREES_IN_CLOCK / 12;
        int degreesForGiveHour = degreesInHour * hours;

        return degreesForGiveHour;
    }

    private int findMinuteAngleForGiveMinutes(int minutes) {
        //Clock has total 360 degrees
        //In an Hour there are 60 minutes
        //So find degrees in a minute
        //multiply degreeInMinutes with given Minutes to find the
        //degree in given minutes

        if (minutes < 0 && minutes > 60) {
            return -1;
        }

        int degreesInMinutes = TOTAL_DEGREES_IN_CLOCK / 60;
        int degreesForGivenMinutes = degreesInMinutes * minutes;

        return degreesForGivenMinutes;
    }
}
