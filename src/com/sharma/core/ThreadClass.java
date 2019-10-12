package com.sharma.core;

public class ThreadClass implements Runnable {

    @Override
    public void run() {
        Thread thread = new Thread();
        thread.start();
    }

    public void processThread(String message, int threadCount) {

        this.run();
    }


    public static void main(String[] args) {

        ThreadClass threadClass = new ThreadClass();
        String message = "Hello from Thread ";
        int threadCount = 10;
        threadClass.processThread(message, threadCount);
    }
}
