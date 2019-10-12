package com.sharma.lambda.impl;

import com.sharma.lambda.Greeting;

public class GoodMorningGreeter implements Greeting {

    //@Override
    public void perform() {
        System.out.println("Good Morning Everyone!");
    }

    @Override
    public void perform(String strGreeting) {
        System.out.println("Good Morning Everyone!");
    }
}
