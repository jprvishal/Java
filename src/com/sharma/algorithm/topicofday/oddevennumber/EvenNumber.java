package com.sharma.algorithm.topicofday.oddevennumber;

public class EvenNumber extends Thread {

    private int limit;
    private SharedPrinter printer;

    EvenNumber(int limit, SharedPrinter printer) {
        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        super.run();
        int evenNumber = 2;

        while(evenNumber <= limit) {
            printer.printEvenNumber(evenNumber);
            evenNumber = evenNumber + 2;
        }
    }
}
