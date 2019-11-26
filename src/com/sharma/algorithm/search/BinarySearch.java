package com.sharma.algorithm.search;

import java.util.Arrays;

public class BinarySearch {

    public int searchIterative(int[] arr, int searchValue) {
        if (arr == null || arr.length == 0) {
            return -1;
        }

        Arrays.sort(arr);

        int index = -1;
        int start = 0;
        int end = arr.length -1;

        while (start < end) {
            int mid = (start + end)/2;

            if (arr[mid] == searchValue) {
                index = mid;
                break;
            } else if (arr[mid] > searchValue) {
                end = mid -1;
            } else {
                start = mid + 1;
            }
        }

        return index;
    }

    public int search(int[] arr, int searchValue) {
        int index = -1;

        if (arr == null || arr.length == 0) {
            return index;
        }

        Arrays.sort(arr);

        index = search(arr, 0, arr.length -1, searchValue);

        return index;
    }

    private int search(int[] arr, int start, int end, int searchValue) {
        if (end < start) {
            return -1;
        }

        int mid = (start + end)/2;
        if (arr[mid] == searchValue) {
            return mid;
        } else if (arr[mid] > searchValue) {
            return search(arr, start, mid -1, searchValue);
        } else {
            return search(arr, mid + 1, end, searchValue);
        }
    }
}
