package com.sharma.datastructure.sorting;

import com.sharma.datastructure.TestDataHelper;

public class BubbleSort {

    private void swap(int[] arr, int target, int source) {
        int temp = arr[target];
        arr[target] = arr[source];
        arr[source] = temp;
    }

    public int[] sort(int[] source) {
        boolean swaped = false;

        for(int i = 0; i < source.length; i++) {
            for (int j = 0; j < source.length - 1; j++) {
                if (source[j] > source[j+1]) {
                    swap(source, j, j+1);
                    swaped = true;
                }

                if (!swaped) {
                    break;
                }
            }
        }
        return source;
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
        BubbleSort bubbleSort = new BubbleSort();
        //int[] arr = {5,4,2,1,3};

        int[] arr = TestDataHelper.prepareIntArray();
        System.out.println("Original Array :-");
        print(arr);

        long startTime = System.currentTimeMillis();
        int[] result = bubbleSort.sort(arr);
        System.out.println("\nSorted Array :-");
        print(result);

        System.out.println("\nTotal time in millis == " + (System.currentTimeMillis() - startTime));
    }
}
