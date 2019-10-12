package com.sharma.core;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class anagramsFinder {
    public static void main(String[] args) {

        String s1 = "cdefaa";
        String s2 = "abce";

        //int numberOfDeletion = getNumberOfDeletion(s1, s2);
        int numberOfDeletion =  anagram(s1, s2);

        System.out.println("numberOfDeletion == " + numberOfDeletion);
    }

    private static int getNumberOfDeletion(String s1, String s2) {
        char[] s1Arr = s1.toCharArray();
        char[] s2Arr = s2.toCharArray();

        HashMap<Character, Integer> s1CharMap = new HashMap<>();
        HashMap<Character, Integer> s2CharMap = new HashMap<>();

        for (Character chr : s1Arr) {
            Integer charCount = s1CharMap.get(chr);
            if (charCount == null) {
                charCount = new Integer(0);
            }

            charCount++;
            s1CharMap.put(chr, charCount);
        }

        for (Character chr : s2Arr) {
            Integer charCount = s2CharMap.get(chr);
            if (charCount == null) {
                charCount = new Integer(0);
            }

            charCount++;
            s2CharMap.put(chr, charCount);
        }

        int numberOfDeletion = 0;
        Iterator<Character> chrIterator = s1CharMap.keySet().iterator();
        while(chrIterator.hasNext()) {
            char key = chrIterator.next();
            Integer s1Count = s1CharMap.get(key);
            Integer s2Count = s2CharMap.get(key);
            if (s2Count == null) {
                s2Count = 0;
            }
            s2CharMap.remove(key);
            numberOfDeletion += Math.abs(s1Count - s2Count);
        }

        chrIterator = s2CharMap.keySet().iterator();
        while(chrIterator.hasNext()) {
            char key = chrIterator.next();
            Integer s2Count = s2CharMap.get(key);
            numberOfDeletion += s2Count;
        }
        return numberOfDeletion;
    }

    private static int anagram(String s1, String s2){
        String s3 = "";
        char c1 [] = s1.toCharArray();
        char c2 [] =s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);
        int count=s1.length()+s2.length();

        for (int i=0; i < c1.length;i++){
            c2 =s2.toCharArray();
            for(int j=0; j < c2.length;j++){
                if(c1[i] == c2[j]) {
                    StringBuilder sb = new StringBuilder(s2);
                    sb.deleteCharAt(j);
                    s3 = s3 + c1[i] + c2[j];
                    s2 = sb.toString();
                    break;
                }
            }
        }
        return (count - s3.length());
    }

}
