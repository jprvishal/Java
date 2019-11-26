package com.sharma.algorithm.dynamicprogramming;

import java.util.Arrays;

public class WayCounterForNStairs {
    //Child need to go on N stairs
    //Child can hop 1 step, 2 steps, or 3 steps at a time
    //Find total way for child to go on N stairs

    int countWays(int n) {
     int[] memo = new int[n + 1];
     Arrays.fill(memo, -1);

     return countWays(n, memo);

    }

    int countWays(int n, int[] memo) {
        if (n < 0) {
            return 0;
        } else if (n == 0) {
            return 1;
        } else if (memo[n] > -1) {
            return memo[n];
        } else {
            memo[n] = countWays(n - 1, memo) + countWays(n - 2, memo) + countWays(n - 3, memo);
        }

        return memo[n];
    }

    public static void main(String[] args) {
        WayCounterForNStairs wayCounterForNStairs = new WayCounterForNStairs();
        int N = 37;
        System.out.println("Max Int value == " + Integer.MAX_VALUE);
        System.out.println("Ways to go on " + N + " stairs == " + wayCounterForNStairs.countWays(N));
    }
}
