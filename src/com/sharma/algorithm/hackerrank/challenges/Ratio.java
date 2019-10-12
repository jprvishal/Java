package com.sharma.algorithm.hackerrank.challenges;

public class Ratio {

    private int numerator;
    private int denominator;
    public static final Ratio ZERO = new Ratio();

    private Ratio() {
        this(0, 1);
    }

    public Ratio(int num, int den) {
        numerator = num;
        if (den > 0) {
            denominator = den;
        } else {
            System.out.println("Denominator can not be zero.");
            System.out.println("Creating a ZERO Ratio");
            numerator = 0;
            denominator =1;
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (!(obj instanceof Ratio)) {
            return false;
        }

        Ratio objRatio = (Ratio)obj;
        return ((this.numerator * objRatio.denominator) == (this.denominator * objRatio.numerator));
    }

    void print() {
        System.out.println("Ratio is == " + numerator + "/" + denominator);
    }
}
