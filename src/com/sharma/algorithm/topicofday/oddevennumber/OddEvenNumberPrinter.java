package com.sharma.algorithm.topicofday.oddevennumber;

import java.util.Scanner;

public class OddEvenNumberPrinter {

    public static void main(String[] args) {

        //Create two thread classes
        //calculate odd and even number
        //print odd and even number in sequence
        SharedPrinter printer = new SharedPrinter();

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the limit for even/odd number printing: ");
        int limit = scan.nextInt();
        OddNumber oddNumber = new OddNumber(limit, printer);
        EvenNumber evenNumber = new EvenNumber(limit, printer);

        oddNumber.setName("Odd Number");
        oddNumber.start();
        evenNumber.setName("Even Number");
        evenNumber.start();

        scan.close();
    }
}
