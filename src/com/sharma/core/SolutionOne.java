package com.sharma.core;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class SolutionOne {

    public static void main(String[] args) {
        int[] arr = {1,2,4,7,10,14};
        int[] arr1 = {2,3,5,7,11,15};

        int[] finalArr = new int[arr.length + arr1.length];

        for (int index = 0; index < arr.length; index++) {

        }

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        byte B = 0b01000000;
        System.out.println(B);
        System.out.println(B << 1);
        System.out.println(B >> 1);
        System.out.println("vishal".substring(1));
    }
}
