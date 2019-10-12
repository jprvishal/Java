package com.sharma.core;

public class MatrixTest {
    public static void main(String[] args) {
        Matrix matrix = new Matrix(3, 3);
        matrix.fillMatrix();
        matrix.print();
        matrix.printAsSpiral();

        matrix = new Matrix(1, 3);
        matrix.fillMatrix();
        matrix.print();
        matrix.printAsSpiral();

        matrix = new Matrix(3, 1);
        matrix.fillMatrix();
        matrix.print();
        matrix.printAsSpiral();

        matrix = new Matrix(4, 4);
        matrix.fillMatrix();
        matrix.print();
        matrix.printAsSpiral();

        matrix = new Matrix(3, 4);
        matrix.fillMatrix();
        matrix.print();
        matrix.printAsSpiral();
    }
}
