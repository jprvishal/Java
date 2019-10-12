package com.sharma.core;

public class LeftShiftIntegerArray {

    public static void main(String[] args) {
        int size = 1000000;
        int numberOfShifts = 500;
        int[] intArr = new int[size];
        for (int i = 0; i < size; i++) {
            intArr[i] = i+1;
        }

       // print(intArr);
        System.out.println(System.currentTimeMillis());

        intArr = leftShiftIntArray(intArr, numberOfShifts);

        System.out.println(System.currentTimeMillis());
        //print(intArr);
    }

    private static int[] leftShiftIntArray(int[] sourceArray, int numberOfShifts) {
        int[] resultArray = new int[sourceArray.length];

        int resultIndex = 0;
        for (int index = numberOfShifts; index < sourceArray.length; index++) {
            resultArray[resultIndex] = sourceArray[index];
            resultIndex++;
        }

        for (int index = 0; index < numberOfShifts; index++) {
            resultArray[resultIndex] = sourceArray[index];
            resultIndex++;
        }

        return resultArray;
    }

    private  static void print(int[] intArr) {
        System.out.println();
        System.out.print("[");
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.print("]");
    }
}
