package com.sharma.core;

import java.util.HashMap;

public class RansomNoteQuestion {

    public static void main(String[] args) {

        String[] magazineLetters = "two times three is not four".split(" ");
        String[] ransomNoteLetters = "two times two is four".split(" ");

        String result = canWriteRansomNote(magazineLetters, ransomNoteLetters);
        System.out.println(result);
    }

    private static String canWriteRansomNote(String[] magazineLetters, String[] ransomNoteLetters) {
        String result = "Yes";

        if (ransomNoteLetters.length > magazineLetters.length) {
            return "No";
        }

        HashMap<String, Integer> countByStringMap = new HashMap<>();
        for (String str : magazineLetters) {
            Integer count = countByStringMap.get(str);
            if (count == null) {
                count = new Integer(0);
            }

            count++;
            countByStringMap.put(str, count);
        }

        for (String strToSearch : ransomNoteLetters) {
            Integer count = countByStringMap.get(strToSearch);
            if (count == null || count <= 0) {
                result = "No";
                break;
            } else {
                count--;
                countByStringMap.put(strToSearch, count);
            }
        }

        return result;
    }

}
