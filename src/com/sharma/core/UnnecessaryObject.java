package com.sharma.core;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UnnecessaryObject {

    public static void main(String[] args) {

        SimpleDateFormat dateFormatter =  new SimpleDateFormat("dd:MM:yyyy:hh:mm:ss:SSS");
        long startMillis = System.currentTimeMillis();
        System.out.println("Start time == " + dateFormatter.format(new Date(startMillis)));

        long integerSum = sumAllIntegers();
        System.out.println("Sum of integer's == " + integerSum);

        long endMillis = System.currentTimeMillis();
        System.out.println("End time == " + dateFormatter.format(new Date(endMillis)));

        System.out.println("\nTotal time taken in millis : " + (endMillis - startMillis));
    }

    private static long sumAllIntegers() {
        Long sum = 0L;

        for (long i = 0 ; i <= Integer.MAX_VALUE; i++) {
            sum += i;
        }

        return sum;
    }
}
