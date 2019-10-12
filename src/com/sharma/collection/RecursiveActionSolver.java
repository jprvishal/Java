package com.sharma.collection;

import java.util.Arrays;
import java.util.concurrent.RecursiveAction;

public class RecursiveActionSolver extends RecursiveAction {
    private int[] list;
    public long result;

    public RecursiveActionSolver(int[] array) {
        this.list = array;
    }

    @Override
    protected void compute() {
        if (list.length == 1) {
            result = list[0];
        } else {
            int midpoint = list.length / 2;
            int[] l1 = Arrays.copyOfRange(list, 0, midpoint);
            int[] l2 = Arrays.copyOfRange(list, midpoint, list.length);
            RecursiveActionSolver solver1 = new RecursiveActionSolver(l1);
            RecursiveActionSolver solver2 = new RecursiveActionSolver(l2);
            //forkJoin(solver1, solver2);
            invokeAll(solver1, solver2);
            result = solver1.result + solver2.result;
        }
   }
}
