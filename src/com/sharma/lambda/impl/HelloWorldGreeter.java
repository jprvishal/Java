package com.sharma.lambda.impl;

import com.sharma.lambda.Greeting;

public class HelloWorldGreeter implements Greeting {

    //@Override
    public void perform() {
        System.out.println("Hello World!");
    }

    @Override
    public void perform(String strGreeting) {
        System.out.println("Hello World!");
    }
}
