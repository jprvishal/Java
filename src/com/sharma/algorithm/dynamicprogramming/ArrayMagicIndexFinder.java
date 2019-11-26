package com.sharma.algorithm.dynamicprogramming;

public class ArrayMagicIndexFinder {

    public static void main(String[] args) {
        int[] arr = {-1, 0, 1, 2, 4, 10};

        linearSearch(arr);
        int index = binarySearch(arr, 0, arr.length-1);
        System.out.println("Magic index == " + index);
    }

    private static int binarySearch(int[] arr, int start, int end) {

        if (start <= end) {
            int mid = (start + end) / 2;

            if (mid == arr[mid]) {
                return mid;
            }

            if (mid < arr[mid]) {
                return binarySearch(arr, start, mid - 1);
            } else {
                return binarySearch(arr, mid + 1, end);
            }
        }
        return -1;
    }

    private static void linearSearch(int[] arr) {
        if (arr == null || arr.length == 0) {
            return;
        }

        for (int index = 0; index < arr.length; index++) {
            if (arr[index] == index) {
                System.out.println("Magic index is == " + index);
                break;
            }
        }
    }
}
