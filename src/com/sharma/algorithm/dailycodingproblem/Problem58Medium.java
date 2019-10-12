/*
An sorted array of integers was rotated an unknown number of times.

Given such an array, find the index of the element in the array in faster than linear time. If the element doesn't exist in the array, return null.

For example, given the array [13, 18, 25, 2, 8, 10] and the element 8, return 4 (the index of 8 in the array).

You can assume all the integers in the array are unique.
*/
package com.sharma.algorithm.dailycodingproblem;

public class Problem58Medium {

    public Integer findIndexOfElement(int[] arr, int element) {

        //int index = findElementIndex(arr, 0, arr.length, element);
        int index = -1;
        int rotationIndex = findRotationIndex(arr);
        int startIndex = rotationIndex;
        int endIndex = rotationIndex - 1;
        rotationIndex = arr.length / 2;

        while (true) {

            int mid = (startIndex + rotationIndex) % arr.length;

            if (arr[mid] == element) {
                index = mid;
                break;
            }

            if (arr[mid] < element) {
                startIndex = (startIndex + rotationIndex) % arr.length;
            }

            if (arr[mid] > element) {
                endIndex = (arr.length + endIndex - rotationIndex) % arr.length;
            }

            if (rotationIndex == 0) {
                return null;
            }

            rotationIndex = rotationIndex / 2;
        }

        return index;
    }

    private int findRotationIndex(int[] arr) {
        int index = arr.length / 2;
        int rotation = index / 2;

        while (true) {
            if (arr[0] > arr[index] && arr[index - 1] > arr[index]) {
                break;
            } else if (rotation == 0) {
                break;
            } else if (arr[0] <= arr[index]) {
                index += rotation;
            } else if (arr[index - 1] <= arr[index]) {
                index -= rotation;
            } else {
                break;
            }

            rotation = rotation / 2;
        }
        return index;
    }

    private int findElementIndex(int[] arr, int startIndex, int endIndex, int element) {
        int index = -1;
        int readIndex = (endIndex - startIndex) / 2;

        if (startIndex > endIndex) {
            return index;
        }

        if (arr[readIndex] == element) {
            index = readIndex;
        } else if (arr[readIndex] < element) {
            findElementIndex(arr, readIndex +1, endIndex, element);
        } else {
            findElementIndex(arr, 0, readIndex -1, element);
        }

        return index;
    }

    public static void main(String[] args) {
        int[] arr = {13, 18, 25, 2, 8, 10};
        int element = 10;

        Problem58Medium problem58Medium = new Problem58Medium();
        Integer index = problem58Medium.findIndexOfElement(arr, element);
        if (index == null) {
            System.out.println("Element doesn't exists in arr.");
        } else {
            System.out.println("Element index is " + index);
        }
    }
}
