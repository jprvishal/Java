package com.sharma.algorithm.dynamicprogramming;

import java.util.Arrays;
import java.util.List;

public class GridPathFInderTest {

    public static void main(String[] args) {
        boolean[][] grid = new boolean[4][4];
        for (int index = 0; index < grid.length; index++) {
            Arrays.fill(grid[index], true);
        }
        grid[0][1] = false;
        grid[1][1] = false;
        GridPathFinder pathFinder = new GridPathFinder();
        long startTime =  System.currentTimeMillis();
        List<GridPathFinder.Point> paths = pathFinder.findPath(grid);
        if (paths != null) {
            for (GridPathFinder.Point path : paths) {
                System.out.println(path);
            }
        }

        System.out.println("Time taken in millis == " + (System.currentTimeMillis() - startTime));
    }
}
