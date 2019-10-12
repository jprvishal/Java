package com.sharma.algorithm.hackerrank.challenges;

public class RatioTester {

    public static void main(String[] args) {
        Ratio ratio = new Ratio(1,2);

        ratio.print();
        ratio.ZERO.print();

        System.out.println(ratio.equals(ratio));
        System.out.println(ratio.equals(ratio.ZERO));
        System.out.println(ratio.ZERO.equals(ratio));
    }
}
