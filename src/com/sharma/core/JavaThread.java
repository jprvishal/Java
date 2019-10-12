package com.sharma.core;

public class JavaThread extends Thread{

    private String message;

    JavaThread(String message) {
        this.message = message;
    }
    @Override
    public void run() {
        System.out.println(message);
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread = new JavaThread("Hello from Thread class");
        thread.start();
        thread.join();
    }
}
