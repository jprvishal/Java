/*
Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less. You must break it up so that words don't break across lines. Each line has to have the maximum possible amount of words. If there's no way to break the text up, then return null.

You can assume that there are no spaces at the ends of the string and that there is exactly one space between each word.

For example, given the string "the quick brown fox jumps over the lazy dog" and k = 10, you should return: ["the quick", "brown fox", "jumps over", "the lazy", "dog"]. No string in the list has a length of more than 10.
 */
package com.sharma.algorithm.dailycodingproblem;

import java.util.ArrayList;
import java.util.List;

public class Problem57 {

    public List<String> convertToMultipleLine(String originalText, int maxLengthOfLine) {
        List<String> multipleLines = new ArrayList<>();

        if (originalText == null || originalText.length() < maxLengthOfLine) {
            return null;
        }

        String[] words = originalText.split(" ");
        StringBuilder line = new StringBuilder();
        for(int index = 0; index < words.length; index++) {
            if (line.length() + words[index].length() + 1<= maxLengthOfLine) {
                if (line.length() > 0) {
                    line.append(" ").append(words[index]);
                } else {
                    line.append(words[index]);
                }
            } else {
                multipleLines.add(line.toString());
                line = new StringBuilder(words[index]);
            }
        }

        multipleLines.add(line.toString());
        return multipleLines;
    }

    public static void main(String[] args) {
        String text = "Given a string s and an integer k, break up the string into multiple lines such that each line has a length of k or less.";
        int maxLineLength = 130;

        Problem57 problem57 = new Problem57();
        List<String> multipleLines = problem57.convertToMultipleLine(text, maxLineLength);
        if (multipleLines != null) {
            multipleLines.stream().forEach(line -> System.out.println(line));
        }
    }
}
