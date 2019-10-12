package com.sharma.algorithm.hackerrank.challenges;

public class KillJVMLUsingLambda {

    /**
     * Starts the Load Generation
     * @param args Command line arguments, ignored
     */
    public static void main(String[] args) {
        int numCore = 4;
        int numThreadsPerCore = 5;
        double load = 0.8;
        final long duration = 100000;
        for (int thread = 0; thread < numCore * numThreadsPerCore; thread++) {
            //new BusyThread("Thread" + thread, load, duration).start();
            Runnable runnable = () -> {
                long startTime = System.currentTimeMillis();
                try {
                    // Loop for the given duration
                    while (System.currentTimeMillis() - startTime < duration) {
                        Double aDouble = new Double(Double.MAX_VALUE);
                        Integer integer = new Integer(Integer.MAX_VALUE);
                        Long longObj = new Long(Long.MAX_VALUE);
                        // Every 100ms, sleep for the percentage of unladen time
                        if (System.currentTimeMillis() % 100 == 0) {
                            double sleepTime = Math.floor((1 - load) * 100);
                            Thread.sleep((long) sleepTime);
                        }

                        System.out.println("Double == " + aDouble);
                        System.out.println("Integer == " + integer);
                        System.out.println("Long == " + longObj);
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            };

            Thread newThread = new Thread(runnable);
            newThread.start();
        }
    }
}
