package com.sharma.lambda;

import com.sharma.lambda.impl.GoodMorningGreeter;
import com.sharma.lambda.impl.HelloWorldGreeter;

import java.util.concurrent.atomic.AtomicInteger;

public class Greeter {

    public void greet(Greeting greeting, String strGreeting) {
        greeting.perform(strGreeting);
    }

    public int perform(Calculator calculator, int num1, int num2) {
        return calculator.calculateMultiple(num1, num2);
    }

    public static void main(String[] args) {

        Greeter greeter = new Greeter();
        HelloWorldGreeter helloWorldGreeter = new HelloWorldGreeter();
        String strGreeting = "Hello World!";
        greeter.greet(helloWorldGreeter, strGreeting);

        AtomicInteger count = new AtomicInteger();


        GoodMorningGreeter goodMorningGreeter = new GoodMorningGreeter();
        strGreeting = "Good Morning, this is Greeter.";
        greeter.greet(goodMorningGreeter, strGreeting);

        Greeting helloWorldGreet =  (stringGreeting) -> System.out.println(stringGreeting);
        strGreeting = "Hello World from Lambda.";
        greeter.greet(helloWorldGreet, strGreeting);

        //helloWorldGreet =  (strGreeting) -> System.out.println("Good Evening from Lambda!");
        strGreeting = "Good Evening from Lambda.";
        greeter.greet(helloWorldGreet, strGreeting);

       //helloWorldGreet =  (strGreeting) -> System.out.println("Good Night from Lambda!");
        strGreeting = "Good Night from Lambda.";
        greeter.greet(helloWorldGreet, strGreeting);

        int num1 = 5;
        int num2 = 10;
        Calculator calculate =  (a, b) ->  a * b;
        int result = greeter.perform(calculate, num1, num2);
        System.out.println("Result of num1 * num2 is == " + result);
    }
}
