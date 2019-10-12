package com.sharma.collection;


import com.sun.istack.internal.NotNull;

public class RASolverTester {

    public static void main(String[] args) {
        int[] intArray = new int[10];
        intArray = populateArray(intArray);

        RecursiveActionSolver solver = new RecursiveActionSolver(intArray);
        solver.compute();

        System.out.println("Result is == " + solver.result);
    }

    private static int[] populateArray(@NotNull int[] inputArray) {
        System.out.println();
        System.out.print("Input Array is {");
        for (int i = 0; i < inputArray.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }

            inputArray[i] = i * 5;
            System.out.print(inputArray[i]);
        }

        System.out.print("}");
        System.out.println();
        return inputArray;
    }
}
