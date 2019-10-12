package com.sharma.algorithm.topicofday.oddevennumber;

public class OddNumber extends Thread {

    private int limit;
    private SharedPrinter printer;

    public OddNumber(int limit, SharedPrinter printer) {
        this.limit = limit;
        this.printer = printer;
    }

    @Override
    public void run() {
        super.run();
        int oddNumber = 1;
        while (oddNumber <= limit) {
          printer.printOddNumber(oddNumber);
          oddNumber = oddNumber + 2;
        }
    }
}
