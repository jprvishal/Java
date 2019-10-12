package com.sharma.datastructure.sorting;

import com.sharma.datastructure.TestDataHelper;

/*
Shell sort is little smarter version of Insertion sort.
It divide the list into multiple sub list using a random increment value
and sort these sub list first
as long as increment value of > 1 once increment value is 1 it perform Insertion Sort on entire list.
 */
public class ShellSort {
    public int[] sort(int[] arr) {
        int increment = arr.length/2 + arr.length%2;

        while (increment > 0) {
            System.out.println("\nWith the increment == " + increment);
            for (int i = 0; i < arr.length; i++) {
                if ((i + increment) < arr.length) {
                    subListSort(arr, i, increment);
                }
            }

            increment = increment / 2;
        }
        return arr;
    }

    private void subListSort(int[] arr, int startIndex, int increment) {
        for(int j = startIndex; (j + increment) < arr.length; j = j + increment) {
            if (arr[j] > arr[j + increment]) {
                swap(arr, j, increment);
            }
        }
    }

    private void swap(int[] arr, int j, int increment) {
        int temp = arr[j];
        arr[j] = arr[j + increment];
        arr[j + increment] = temp;
    }


    private static void print(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr = TestDataHelper.prepareIntArray();
        ShellSort shellSort = new ShellSort();
        System.out.println("Original Array :-");
        print(arr);

        long startTime = System.currentTimeMillis();
        int[] result = shellSort.sort(arr);
        System.out.println("\nSorted Array :-");
        print(result);

        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));

    }
}
