package com.sharma.algorithm.topicofday.oddevennumber;


public class SharedPrinter {

    private boolean isOddPrinted;

    synchronized void printOddNumber(int oddNumber) {

        while (isOddPrinted) {

            try {
                wait();
            } catch (InterruptedException exp) {
                exp.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + oddNumber);
        isOddPrinted = true;

        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        notify();
    }

    synchronized void printEvenNumber(int evenNumber) {

        while(!isOddPrinted) {
            try {
                wait();
            } catch(InterruptedException ex) {
                ex.printStackTrace();
            }
        }

        System.out.println(Thread.currentThread().getName() + " : " + evenNumber);
        isOddPrinted = false;

        try {
            Thread.sleep(300);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }

        notify();
    }
}
