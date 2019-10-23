package com.sharma.core;

import java.util.LinkedHashMap;
import java.util.Map;
/*
* Count number of words in the give string separated by whitespaces.
* Count count of each non-whitespace character
* Count occurrence of each character
* */
public class WordCounter {

    public static void main(String[] args) {
        String input = "Abracadabra       Alakazam!!";

        if (input == null) {
            return;
        }

        String[] wordsInString = input.split("\\s+");
        Map<Character, Integer> characterMap = new LinkedHashMap<>();

        char[] charArray = input.toCharArray();
        int totalCharacters = 0;
        for (char chr : charArray) {
            Integer charCount = characterMap.get(chr);

            if (charCount == null) {
                charCount = 0;
            }

            totalCharacters++;
            charCount = charCount.intValue() + 1;
            characterMap.put(chr, charCount);
        }

        System.out.println("Word count = " + wordsInString.length);
        System.out.println("Non-whitespace character count = " + totalCharacters);

        characterMap.keySet().forEach(key -> {
            System.out.println(key +": " + characterMap.get(key).intValue());
        });
    }
}
