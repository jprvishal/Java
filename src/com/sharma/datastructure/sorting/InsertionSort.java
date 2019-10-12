package com.sharma.datastructure.sorting;

import com.sharma.datastructure.TestDataHelper;

public class InsertionSort {

    public int[] sort(int[] arr) {

        for(int i = 0; i < arr.length -1; i++) {
            for(int j = i +1; j > 0; j--) {
                if (arr[j-1] > arr[j]) {
                    swap(arr, j-1, j);
                } else {
                    break;
                }
            }
        }

        return arr;
    }

    private void swap(int[] arr, int target, int source) {
        int temp = arr[target];
        arr[target] = arr[source];
        arr[source] = temp;
    }


    private static void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            if (i > 0) {
                System.out.print(", ");
            }
            System.out.print(result[i]);
        }
    }

    public static void main(String[] args) {
        InsertionSort insertionSort = new InsertionSort();
        int arr[] = TestDataHelper.prepareIntArray();
        System.out.println("Original Array ");
        print(arr);

        long startTime = System.currentTimeMillis();
        int result[] = insertionSort.sort(arr);
        System.out.println("\nSorted Array ");
        print(result);

        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));
    }
}
