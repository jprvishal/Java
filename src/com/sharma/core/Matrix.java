package com.sharma.core;

public class Matrix {
    private int[][] matrix;
    private int rows;
    private int cols;

    Matrix(int m, int n) {
        matrix = new int[m][n];
        rows = m;
        cols = n;
    }

    public void fillMatrix() {
        int fillNum = 1;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = fillNum++;
            }
        }
    }

    public void print() {
        int fillNum = 1;

        System.out.println("[");
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (col > 0) {
                    System.out.print(" ");
                }
                System.out.print(matrix[row][col]);
            }
            System.out.println();
        }
        System.out.print("]");
        System.out.println();
    }


    public void printAsSpiral() {
        if (matrix.length == 0) {
            return;
        }

        System.out.println("[");
        printRowLeftToRight(matrix, 0, matrix[0].length);
        printColumn(matrix, matrix.length -1, matrix[0].length -1 );
        printRowRightToLeft(matrix, matrix.length -1, matrix[0].length -1);

        for (int row = matrix.length - 2; row > 0; row--) {

            if ((rows - (row+1)) % 2 == 0) {
                printRowRightToLeft(matrix, row, matrix[row].length - 1);
            } else {
                printRowLeftToRight(matrix, row, matrix[row].length - 1);
            }
        }

        System.out.println("]");

    }

    private void printRowLeftToRight(int[][] matrix, int row, int maxCol) {

        for (int col = 0; col < maxCol; col++) {
            if (col > 0 || row > 0) {
                System.out.print(",");
            }
            System.out.print(matrix[row][col]);
        }

    }

    private void printRowRightToLeft(int[][] matrix, int row, int maxCol) {

        if (row > 0) {
            for (int col = maxCol - 1; col >= 0; col--) {
                if (col >= 0) {
                    System.out.print(",");
                }
                System.out.print(matrix[row][col]);
            }
        }
    }

    private void printColumn(int[][] matrix, int maxRow, int col) {
        for (int row = 1; row <= maxRow; row++) {
            if (col > 0 | row > 0) {
                System.out.print(",");
            }
            System.out.print(matrix[row][col]);
        }
    }
}
