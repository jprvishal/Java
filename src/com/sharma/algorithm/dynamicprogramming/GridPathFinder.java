package com.sharma.algorithm.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class GridPathFinder {

    class Point {
        int row;
        int col;

        public Point(int r, int c) {
            this.row = r;
            this.col = c;
        }

        public String toString() {
            return "row == " + this.row + ", col == " + col;
        }
    }

    public List<Point> findPath(boolean[][] grid) {
        if (grid == null || grid.length == 0) {
            return null;
        }

        List<Point> paths = new ArrayList<>();
        HashSet<Point> failedPaths = new HashSet<>();
        findPath(grid, grid.length - 1, grid[0].length - 1, paths, failedPaths);

        return paths;
    }

    private boolean findPath(boolean[][] grid, int row, int col, List<Point> paths, HashSet<Point> failedPaths) {
        if (row < 0 || col < 0 || !grid[row][col]) {
            return false;
        }

        Point path = new Point(row, col);

        if (failedPaths.contains(path)) {
            return false;
        }

        boolean isOrigin = (row == 0 && col == 0);

        if (isOrigin || findPath(grid, row - 1, col, paths, failedPaths)
                || findPath(grid, row, col - 1, paths, failedPaths)) {
            paths.add(path);
            return true;
        }

        failedPaths.add(path);
        return false;
    }

}
