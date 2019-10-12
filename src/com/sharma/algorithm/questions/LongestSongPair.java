package com.sharma.algorithm.questions;

public class LongestSongPair {

    public static void main(String[] args) {

        int[] input = {100,120,180,40,6};
        int maxDuration = 250;
        int buffer = 30;
        String maxSongIndexPair = null;
        int pair1Index1 = -1;
        int pair1Index2 = -1;

        for (int index = 0; index < input.length; index++) {
            for ( int innerIndex = index +1; innerIndex < input.length; innerIndex++) {
                if (input[index] + input[innerIndex] == (maxDuration - buffer)) {

                    System.out.println("{" + index + "," + innerIndex + "}");

                    if (pair1Index1 > -1 && pair1Index2 > -1) {
                        if (input[pair1Index1] < input[index] ) {
                            maxSongIndexPair = index + "," + innerIndex;
                            pair1Index1 = index;
                            pair1Index2 = innerIndex;
                        }
                    } else {
                        maxSongIndexPair = index + "," + innerIndex;
                        pair1Index1 = index;
                        pair1Index2 = innerIndex;
                    }
                }
            }
        }

        System.out.println();
        System.out.println("{" + maxSongIndexPair + "}");
    }
}
