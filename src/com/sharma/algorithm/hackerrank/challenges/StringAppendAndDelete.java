package com.sharma.algorithm.hackerrank.challenges;

public class StringAppendAndDelete {

    private static String appendAndDelete(String s, String t, int k) {

        String result = "No";
        if (s == null || t == null) {
            return result;
        }

        char[] s1CharArr = s.toCharArray();
        char[] s2CharArr = t.toCharArray();
        int sameCharacterLength = 0;

        for (int i = 0; i < s.length(); i++) {
            if (i > (t.length() - 1)) {
                break;
            }

            if (s1CharArr[i] != s2CharArr[i]) {
                break;
            }

            sameCharacterLength++;
        }

        int charToBeRemovedCount = s.length() - sameCharacterLength;
        int charToAppendCount = t.length() - sameCharacterLength;
        int numberOfOperationNeeded = charToBeRemovedCount + charToAppendCount;

        if (numberOfOperationNeeded == 0) {
            numberOfOperationNeeded = (s.length() * 2) + 1;
        }
        if (numberOfOperationNeeded == k) {
            result = "Yes";
        }

        return result;
    }

    public static void main(String[] args) {

        String result = StringAppendAndDelete.appendAndDelete("hackerhappy", "hackerrank" , 9);
        System.out.println(result);

        result = StringAppendAndDelete.appendAndDelete("aba", "aba" , 7);
        System.out.println(result);

        result = StringAppendAndDelete.appendAndDelete("ashley", "ash" , 2);
        System.out.println(result);

        result = StringAppendAndDelete.appendAndDelete("thihsivdhidnihoin", "ash" , 15);
        System.out.println(result);

    }
}
